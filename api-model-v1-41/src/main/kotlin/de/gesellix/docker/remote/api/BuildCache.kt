/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package de.gesellix.docker.remote.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * BuildCache contains information about a build cache record.
 *
 * @param ID Unique ID of the build cache record.
 * @param parent ID of the parent build cache record.  > **Deprecated**: This field is deprecated, and omitted if empty.
 * @param parents List of parent build cache record IDs.
 * @param type Cache record type.
 * @param description Description of the build-step that produced the build cache.
 * @param inUse Indicates if the build cache is in use.
 * @param shared Indicates if the build cache is shared.
 * @param propertySize Amount of disk space used by the build cache (in bytes).
 * @param createdAt Date and time at which the build cache was created in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
 * @param lastUsedAt Date and time at which the build cache was last used in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
 * @param usageCount
 */
@JsonClass(generateAdapter = true)

data class BuildCache(

    /* Unique ID of the build cache record.  */
    @Json(name = "ID")
    var ID: kotlin.String? = null,

    /* ID of the parent build cache record.  > **Deprecated**: This field is deprecated, and omitted if empty.  */
    @Json(name = "Parent")
    var parent: kotlin.String? = null,

    /* List of parent build cache record IDs.  */
    @Json(name = "Parents")
    var parents: kotlin.collections.MutableList<kotlin.String>? = null,

    /* Cache record type.  */
    @Json(name = "Type")
    var type: BuildCache.Type? = null,

    /* Description of the build-step that produced the build cache.  */
    @Json(name = "Description")
    var description: kotlin.String? = null,

    /* Indicates if the build cache is in use.  */
    @Json(name = "InUse")
    var inUse: kotlin.Boolean? = null,

    /* Indicates if the build cache is shared.  */
    @Json(name = "Shared")
    var shared: kotlin.Boolean? = null,

    /* Amount of disk space used by the build cache (in bytes).  */
    @Json(name = "Size")
    var propertySize: kotlin.Int? = null,

    /* Date and time at which the build cache was created in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  */
    @Json(name = "CreatedAt")
    var createdAt: kotlin.String? = null,

    /* Date and time at which the build cache was last used in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  */
    @Json(name = "LastUsedAt")
    var lastUsedAt: kotlin.String? = null,

    @Json(name = "UsageCount")
    var usageCount: kotlin.Int? = null

) {

    /**
     * Cache record type.
     *
     * Values: Internal,Frontend,SourcePeriodLocal,SourcePeriodGitPeriodCheckout,ExecPeriodCachemount,Regular
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "internal")
        Internal("internal"),

        @Json(name = "frontend")
        Frontend("frontend"),

        @Json(name = "source.local")
        SourcePeriodLocal("source.local"),

        @Json(name = "source.git.checkout")
        SourcePeriodGitPeriodCheckout("source.git.checkout"),

        @Json(name = "exec.cachemount")
        ExecPeriodCachemount("exec.cachemount"),

        @Json(name = "regular")
        Regular("regular");
    }
}
