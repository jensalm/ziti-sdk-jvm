/*
 * Ziti Edge Client
 * OpenZiti Edge Client API
 *
 * The version of the OpenAPI document: 0.26.18
 * Contact: help@openziti.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openziti.edge.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;

/** CurrentApiSessionCertificateCreate */
@JsonPropertyOrder({CurrentApiSessionCertificateCreate.JSON_PROPERTY_CSR})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-05-29T12:39:01.933257-04:00[America/New_York]",
        comments = "Generator version: 7.6.0")
public class CurrentApiSessionCertificateCreate {
    public static final String JSON_PROPERTY_CSR = "csr";
    private String csr;

    public CurrentApiSessionCertificateCreate() {}

    public CurrentApiSessionCertificateCreate csr(String csr) {
        this.csr = csr;
        return this;
    }

    /**
     * Get csr
     *
     * @return csr
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CSR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCsr() {
        return csr;
    }

    @JsonProperty(JSON_PROPERTY_CSR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCsr(String csr) {
        this.csr = csr;
    }

    /** Return true if this currentApiSessionCertificateCreate object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrentApiSessionCertificateCreate currentApiSessionCertificateCreate =
                (CurrentApiSessionCertificateCreate) o;
        return Objects.equals(this.csr, currentApiSessionCertificateCreate.csr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrentApiSessionCertificateCreate {\n");
        sb.append("    csr: ").append(toIndentedString(csr)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert the instance into URL query string.
     *
     * @return URL query string
     */
    public String toUrlQueryString() {
        return toUrlQueryString(null);
    }

    /**
     * Convert the instance into URL query string.
     *
     * @param prefix prefix of the query string
     * @return URL query string
     */
    public String toUrlQueryString(String prefix) {
        String suffix = "";
        String containerSuffix = "";
        String containerPrefix = "";
        if (prefix == null) {
            // style=form, explode=true, e.g. /pet?name=cat&type=manx
            prefix = "";
        } else {
            // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
            prefix = prefix + "[";
            suffix = "]";
            containerSuffix = "]";
            containerPrefix = "[";
        }

        StringJoiner joiner = new StringJoiner("&");

        // add `csr` to the URL query string
        if (getCsr() != null) {
            joiner.add(
                    String.format(
                            "%scsr%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getCsr()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
