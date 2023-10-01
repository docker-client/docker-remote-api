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
 *
 *
 * @param prefix
 * @param capability
 * @param version
 */
@JsonClass(generateAdapter = true)

data class PluginInterfaceType(

    @Json(name = "Prefix")
    var prefix: kotlin.String,

    @Json(name = "Capability")
    var capability: kotlin.String,

    @Json(name = "Version")
    var version: kotlin.String

)
