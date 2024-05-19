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
 *
 *
 * @param path Device path
 * @param rate Rate
 */
@JsonClass(generateAdapter = true)
data class ThrottleDevice(
    // Device path
    @Json(name = "Path")
    var path: kotlin.String? = null,
    // Rate
    @Json(name = "Rate")
    var rate: kotlin.Long? = null,
)