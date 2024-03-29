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
 * Usage details about the volume. This information is used by the `GET /system/df` endpoint, and omitted in other endpoints.
 *
 * @param propertySize Amount of disk space used by the volume (in bytes). This information is only available for volumes created with the `\"local\"` volume driver. For volumes created with other volume drivers, this field is set to `-1` (\"not available\")
 * @param refCount The number of containers referencing this volume. This field is set to `-1` if the reference-count is not available.
 */
@JsonClass(generateAdapter = true)
data class VolumeUsageData(
    // Amount of disk space used by the volume (in bytes). This information is only available for volumes created with the `\"local\"` volume driver. For volumes created with other volume drivers, this field is set to `-1` (\"not available\")
    @Json(name = "Size")
    var propertySize: kotlin.Long = -1L,
    // The number of containers referencing this volume. This field is set to `-1` if the reference-count is not available.
    @Json(name = "RefCount")
    var refCount: kotlin.Long = -1L,
)
