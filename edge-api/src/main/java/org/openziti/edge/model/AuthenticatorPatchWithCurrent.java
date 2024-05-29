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

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;
import org.openapitools.jackson.nullable.JsonNullable;

/** All of the fields on an authenticator that may be updated */
@JsonPropertyOrder({
    AuthenticatorPatchWithCurrent.JSON_PROPERTY_PASSWORD,
    AuthenticatorPatchWithCurrent.JSON_PROPERTY_TAGS,
    AuthenticatorPatchWithCurrent.JSON_PROPERTY_USERNAME,
    AuthenticatorPatchWithCurrent.JSON_PROPERTY_CURRENT_PASSWORD
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-05-29T12:39:01.933257-04:00[America/New_York]",
        comments = "Generator version: 7.6.0")
public class AuthenticatorPatchWithCurrent {
    public static final String JSON_PROPERTY_PASSWORD = "password";
    private JsonNullable<String> password = JsonNullable.<String>undefined();

    public static final String JSON_PROPERTY_TAGS = "tags";
    private Tags tags;

    public static final String JSON_PROPERTY_USERNAME = "username";
    private JsonNullable<String> username = JsonNullable.<String>undefined();

    public static final String JSON_PROPERTY_CURRENT_PASSWORD = "currentPassword";
    private String currentPassword;

    public AuthenticatorPatchWithCurrent() {}

    public AuthenticatorPatchWithCurrent password(String password) {
        this.password = JsonNullable.<String>of(password);
        return this;
    }

    /**
     * Get password
     *
     * @return password
     */
    @javax.annotation.Nullable
    @JsonIgnore
    public String getPassword() {
        return password.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_PASSWORD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getPassword_JsonNullable() {
        return password;
    }

    @JsonProperty(JSON_PROPERTY_PASSWORD)
    public void setPassword_JsonNullable(JsonNullable<String> password) {
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = JsonNullable.<String>of(password);
    }

    public AuthenticatorPatchWithCurrent tags(Tags tags) {
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

    public AuthenticatorPatchWithCurrent username(String username) {
        this.username = JsonNullable.<String>of(username);
        return this;
    }

    /**
     * Get username
     *
     * @return username
     */
    @javax.annotation.Nullable
    @JsonIgnore
    public String getUsername() {
        return username.orElse(null);
    }

    @JsonProperty(JSON_PROPERTY_USERNAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public JsonNullable<String> getUsername_JsonNullable() {
        return username;
    }

    @JsonProperty(JSON_PROPERTY_USERNAME)
    public void setUsername_JsonNullable(JsonNullable<String> username) {
        this.username = username;
    }

    public void setUsername(String username) {
        this.username = JsonNullable.<String>of(username);
    }

    public AuthenticatorPatchWithCurrent currentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
        return this;
    }

    /**
     * Get currentPassword
     *
     * @return currentPassword
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_CURRENT_PASSWORD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCurrentPassword() {
        return currentPassword;
    }

    @JsonProperty(JSON_PROPERTY_CURRENT_PASSWORD)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    /** Return true if this authenticatorPatchWithCurrent object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthenticatorPatchWithCurrent authenticatorPatchWithCurrent =
                (AuthenticatorPatchWithCurrent) o;
        return equalsNullable(this.password, authenticatorPatchWithCurrent.password)
                && Objects.equals(this.tags, authenticatorPatchWithCurrent.tags)
                && equalsNullable(this.username, authenticatorPatchWithCurrent.username)
                && Objects.equals(
                        this.currentPassword, authenticatorPatchWithCurrent.currentPassword);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(password), tags, hashCodeNullable(username), currentPassword);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthenticatorPatchWithCurrent {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
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

        // add `password` to the URL query string
        if (getPassword() != null) {
            joiner.add(
                    String.format(
                            "%spassword%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getPassword()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `tags` to the URL query string
        if (getTags() != null) {
            joiner.add(getTags().toUrlQueryString(prefix + "tags" + suffix));
        }

        // add `username` to the URL query string
        if (getUsername() != null) {
            joiner.add(
                    String.format(
                            "%susername%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(String.valueOf(getUsername()), StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        // add `currentPassword` to the URL query string
        if (getCurrentPassword() != null) {
            joiner.add(
                    String.format(
                            "%scurrentPassword%s=%s",
                            prefix,
                            suffix,
                            URLEncoder.encode(
                                            String.valueOf(getCurrentPassword()),
                                            StandardCharsets.UTF_8)
                                    .replaceAll("\\+", "%20")));
        }

        return joiner.toString();
    }
}
