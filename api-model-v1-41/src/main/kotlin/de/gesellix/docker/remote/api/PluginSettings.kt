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
 * Settings that can be modified by users.
 *
 * @param mounts
 * @param env
 * @param args
 * @param devices
 */
@JsonClass(generateAdapter = true)
data class PluginSettings(
    @Json(name = "Mounts")
    var mounts: kotlin.collections.MutableList<PluginMount>,
    @Json(name = "Env")
    var env: kotlin.collections.MutableList<kotlin.String>,
    @Json(name = "Args")
    var args: kotlin.collections.MutableList<kotlin.String>,
    @Json(name = "Devices")
    var devices: kotlin.collections.MutableList<PluginDevice>,
)
