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
    "UnusedImport",
)

package de.gesellix.docker.remote.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Optional configuration for the `tmpfs` type.
 *
 * @param sizeBytes The size for the tmpfs mount in bytes.
 * @param mode The permission mode for the tmpfs mount in an integer.
 */
@JsonClass(generateAdapter = true)
data class MountTmpfsOptions(
    // The size for the tmpfs mount in bytes.
    @Json(name = "SizeBytes")
    var sizeBytes: kotlin.Long? = null,
    // The permission mode for the tmpfs mount in an integer.
    @Json(name = "Mode")
    var mode: kotlin.Int? = null,
)
