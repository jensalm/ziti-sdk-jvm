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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.StringJoiner;

/** CurrentApiSessionCertificateDetail */
@JsonPropertyOrder({
    CurrentApiSessionCertificateDetail.JSON_PROPERTY_LINKS,
    CurrentApiSessionCertificateDetail.JSON_PROPERTY_CREATED_AT,
    CurrentApiSessionCertificateDetail.JSON_PROPERTY_ID,
    CurrentApiSessionCertificateDetail.JSON_PROPERTY_TAGS,
    CurrentApiSessionCertificateDetail.JSON_PROPERTY_UPDATED_AT,
    CurrentApiSessionCertificateDetail.JSON_PROPERTY_CERTIFICATE,
    CurrentApiSessionCertificateDetail.JSON_PROPERTY_FINGERPRINT,
    CurrentApiSessionCertificateDetail.JSON_PROPERTY_SUBJECT,
    CurrentApiSessionCertificateDetail.JSON_PROPERTY_VALID_FROM,
    CurrentApiSessionCertificateDetail.JSON_PROPERTY_VALID_TO
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-05-29T12:39:01.933257-04:00[America/New_York]",
        comments = "Generator version: 7.6.0")
public class CurrentApiSessionCertificateDetail {
    public static final String JSON_PROPERTY_LINKS = "_links";
    private Map<String, Link> links = new HashMap<>();

    public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
    private OffsetDateTime createdAt;

    public static final String JSON_PROPERTY_ID = "id";
    private String id;

    public static final String JSON_PROPERTY_TAGS = "tags";
    private Tags tags;

    public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
    private OffsetDateTime updatedAt;

    public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
    private String certificate;

    public static final String JSON_PROPERTY_FINGERPRINT = "fingerprint";
    private String fingerprint;

    public static final String JSON_PROPERTY_SUBJECT = "subject";
    private String subject;

    public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
    private OffsetDateTime validFrom;

    public static final String JSON_PROPERTY_VALID_TO = "validTo";
    private OffsetDateTime validTo;

    public CurrentApiSessionCertificateDetail() {}

    public CurrentApiSessionCertificateDetail links(Map<String, Link> links) {
        this.links = links;
        return this;
    }

    public CurrentApiSessionCertificateDetail putLinksItem(String key, Link linksItem) {
        if (this.links == null) {
            this.links = new HashMap<>();
        }
        this.links.put(key, linksItem);
        return this;
    }

    /**
     * A map of named links
     *
     * @return links
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_LINKS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Map<String, Link> getLinks() {
        return links;
    }

    @JsonProperty(JSON_PROPERTY_LINKS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLinks(Map<String, Link> links) {
        this.links = links;
    }

    public CurrentApiSessionCertificateDetail createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     *
     * @return createdAt
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    @JsonProperty(JSON_PROPERTY_CREATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CurrentApiSessionCertificateDetail id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(String id) {
        this.id = id;
    }

    public CurrentApiSessionCertificateDetail tags(Tags tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get tags
     *
     * @return tags
     */
    @javax.annotation.Nullable
    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Tags getTags() {
        return tags;
    }

    @JsonProperty(JSON_PROPERTY_TAGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTags(Tags tags) {
        this.tags = tags;
    }

    public CurrentApiSessionCertificateDetail updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     *
     * @return updatedAt
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty(JSON_PROPERTY_UPDATED_AT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CurrentApiSessionCertificateDetail certificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get certificate
     *
     * @return certificate
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CERTIFICATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCertificate() {
        return certificate;
    }

    @JsonProperty(JSON_PROPERTY_CERTIFICATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public CurrentApiSessionCertificateDetail fingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * Get fingerprint
     *
     * @return fingerprint
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_FINGERPRINT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getFingerprint() {
        return fingerprint;
    }

    @JsonProperty(JSON_PROPERTY_FINGERPRINT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public CurrentApiSessionCertificateDetail subject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get subject
     *
     * @return subject
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SUBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSubject() {
        return subject;
    }

    @JsonProperty(JSON_PROPERTY_SUBJECT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public CurrentApiSessionCertificateDetail validFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * Get validFrom
     *
     * @return validFrom
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VALID_FROM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getValidFrom() {
        return validFrom;
    }

    @JsonProperty(JSON_PROPERTY_VALID_FROM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setValidFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public CurrentApiSessionCertificateDetail validTo(OffsetDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     * Get validTo
     *
     * @return validTo
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_VALID_TO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public OffsetDateTime getValidTo() {
        return validTo;
    }

    @JsonProperty(JSON_PROPERTY_VALID_TO)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setValidTo(OffsetDateTime validTo) {
        this.validTo = validTo;
    }

    /** Return true if this currentApiSessionCertificateDetail object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CurrentApiSessionCertificateDetail currentApiSessionCertificateDetail =
                (CurrentApiSessionCertificateDetail) o;
        return Objects.equals(this.links, currentApiSessionCertificateDetail.links)
                && Objects.equals(this.createdAt, currentApiSessionCertificateDetail.createdAt)
                && Objects.equals(this.id, currentApiSessionCertificateDetail.id)
                && Objects.equals(this.tags, currentApiSessionCertificateDetail.tags)
                && Objects.equals(this.updatedAt, currentApiSessionCertificateDetail.updatedAt)
                && Objects.equals(this.certificate, currentApiSessionCertificateDetail.certificate)
                && Objects.equals(this.fingerprint, currentApiSessionCertificateDetail.fingerprint)
                && Objects.equals(this.subject, currentApiSessionCertificateDetail.subject)
                && Objects.equals(this.validFrom, currentApiSessionCertificateDetail.validFrom)
                && Objects.equals(this.validTo, currentApiSessionCertificateDetail.validTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                links,
                createdAt,
                id,
                tags,
                updatedAt,
                certificate,
                fingerprint,
                subject,
                validFrom,
                validTo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CurrentApiSessionCertificateDetail {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

        // add `_links` to the URL query string
        if (getLinks() != null) {
            for (String _key : getLinks().keySet()) {
                if (getLinks().get(_key) != null) {
                    joiner.add(
                            getLinks()
                                    .get(_key)
                                    .toUrlQueryString(
                                            String.format(
                                                    "%s_links%s%s",
                                                    prefix,
                                                    suffix,
                                                    "".equals(suffix)
                                                            ? ""
                                                            : String.format(
                                                                    "%s%d%s",
                                                                    containerPrefix,
                                                                    _key,
                                                                    containerSuffix))));
                }
            }
        }

        // add `createdAt` to the URL query string
        if (getCreatedAt() != null) {
            joiner.add(
                    String.format(
                            "%screatedAt%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCreatedAt()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `id` to the URL query string
        if (getId() != null) {
            joiner.add(
                    String.format(
                            "%sid%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getId()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `tags` to the URL query string
        if (getTags() != null) {
            joiner.add(getTags().toUrlQueryString(prefix + "tags" + suffix));
        }

        // add `updatedAt` to the URL query string
        if (getUpdatedAt() != null) {
            joiner.add(
                    String.format(
                            "%supdatedAt%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getUpdatedAt()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `certificate` to the URL query string
        if (getCertificate() != null) {
            joiner.add(
                    String.format(
                            "%scertificate%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCertificate()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `fingerprint` to the URL query string
        if (getFingerprint() != null) {
            joiner.add(
                    String.format(
                            "%sfingerprint%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getFingerprint()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `subject` to the URL query string
        if (getSubject() != null) {
            joiner.add(
                    String.format(
                            "%ssubject%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getSubject()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `validFrom` to the URL query string
        if (getValidFrom() != null) {
            joiner.add(
                    String.format(
                            "%svalidFrom%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getValidFrom()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `validTo` to the URL query string
        if (getValidTo() != null) {
            joiner.add(
                    String.format(
                            "%svalidTo%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getValidTo()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
