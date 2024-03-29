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
 * @param name
 * @param description
 * @param settable
 * @param path
 */
@JsonClass(generateAdapter = true)
data class PluginDevice(
    @Json(name = "Name")
    var name: kotlin.String,
    @Json(name = "Description")
    var description: kotlin.String,
    @Json(name = "Settable")
    var settable: kotlin.collections.MutableList<kotlin.String>,
    @Json(name = "Path")
    var path: kotlin.String,
)
