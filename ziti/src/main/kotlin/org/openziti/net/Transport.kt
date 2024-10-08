/*
 * Copyright (c) 2018-2021 NetFoundry Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openziti.net

import kotlinx.coroutines.*
import org.openziti.net.internal.SSLEngineWrapper
import org.openziti.net.nio.readSuspend
import org.openziti.net.nio.writeCompletely
import tlschannel.ClientTlsChannel
import tlschannel.HeapBufferAllocator
import tlschannel.async.AsynchronousTlsChannel
import tlschannel.async.AsynchronousTlsChannelGroup
import java.io.Closeable
import java.io.IOException
import java.net.InetAddress
import java.net.InetSocketAddress
import java.net.SocketTimeoutException
import java.net.URI
import java.nio.ByteBuffer
import java.nio.channels.SocketChannel
import java.util.concurrent.CancellationException
import java.util.concurrent.CompletableFuture
import javax.net.ssl.SSLContext
import javax.net.ssl.SSLEngine

internal interface Transport : Closeable {

    companion object {
        suspend fun dial(address: String, ssl: SSLContext, timeout: Long, vararg protos: String): Transport {
            val url = URI.create(address)
            val tls = TLS(url.host, url.port, ssl, *protos)
            tls.connect(timeout)
            return tls
        }
    }

    fun applicationProtocol(): String?
    fun isClosed(): Boolean
    suspend fun connect(timeout: Long)

    suspend fun write(buf: ByteBuffer)
    suspend fun read(buf: ByteBuffer, full: Boolean = true): Int

    class TLS(host: String, port: Int, sslContext: SSLContext, vararg appProto: String) : Transport {
        lateinit var socket: AsynchronousTlsChannel
        private val addr = InetSocketAddress(InetAddress.getByName(host), port)
        private val sslEngine: SSLEngine

        init {
            val sslParms = sslContext.defaultSSLParameters
            sslParms.applicationProtocols = appProto

            sslEngine = sslContext.createSSLEngine(host, port).apply {
                sslParameters = sslParms
                useClientMode = true
            }
        }

        override fun applicationProtocol(): String? = sslEngine.applicationProtocol

        override suspend fun connect(timeout: Long) {
            val connOp = connectAsync(addr, sslEngine)
            sslEngine.handshakeStatus
            socket = kotlin.runCatching {
                withTimeout(timeout) {
                    connOp.await()
                }
            }.onFailure { ex ->
                if (ex is TimeoutCancellationException) {
                    connOp.cancel("connect timeout", SocketTimeoutException())
                    throw SocketTimeoutException()
                }
                connOp.cancel()
                throw IOException(ex)
            }.getOrThrow()
        }

        override suspend fun write(buf: ByteBuffer) {
            socket.writeCompletely(buf)
        }

        override suspend fun read(buf: ByteBuffer, full: Boolean): Int {
            var res = socket.readSuspend(buf)
            if (res == -1) return res

            while (full && buf.hasRemaining()) {
                val rc = socket.readSuspend(buf)
                if (rc == -1) break
                res += rc
            }
            return res
        }

        override fun close() = socket.close()

        override fun isClosed(): Boolean = !socket.isOpen

        override fun toString(): String = "TLS:${addr}"

        companion object {
            val asyncGroup = AsynchronousTlsChannelGroup()

            internal fun connectAsync(address: InetSocketAddress, ssl: SSLEngine): Deferred<AsynchronousTlsChannel> {
                val deferred = CompletableDeferred<AsynchronousTlsChannel>()
                val sockCh = SocketChannel.open()

                val f = CompletableFuture.supplyAsync {
                    sockCh.connect(address)
                    val tlsCh = ClientTlsChannel.newBuilder(sockCh, ssl)
                        .withEncryptedBufferAllocator(HeapBufferAllocator())
                        .withPlainBufferAllocator(HeapBufferAllocator())
                        .build()
                    tlsCh.handshake()

                    sockCh.configureBlocking(false)
                    AsynchronousTlsChannel(asyncGroup, tlsCh, sockCh)
                }
                f.whenComplete { ch, ex ->
                    ch?.let { deferred.complete(it) }
                    ex?.let { deferred.completeExceptionally(it.cause ?: it) }
                }
                deferred.invokeOnCompletion { ex ->
                    if (ex is CancellationException) {
                        // attempt to interrupt connect op
                        sockCh.runCatching { close() }
                    }
                }
                return deferred
            }
        }
    }
}
