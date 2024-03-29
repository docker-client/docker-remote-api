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
 * A plugin for the Engine API
 *
 * @param name
 * @param enabled True if the plugin is running. False if the plugin is not running, only installed.
 * @param settings
 * @param config
 * @param id
 * @param pluginReference plugin remote reference used to push/pull the plugin
 */
@JsonClass(generateAdapter = true)
data class Plugin(
    @Json(name = "Name")
    var name: kotlin.String,
    // True if the plugin is running. False if the plugin is not running, only installed.
    @Json(name = "Enabled")
    var enabled: kotlin.Boolean,
    @Json(name = "Settings")
    var settings: PluginSettings,
    @Json(name = "Config")
    var config: PluginConfig,
    @Json(name = "Id")
    var id: kotlin.String? = null,
    // plugin remote reference used to push/pull the plugin
    @Json(name = "PluginReference")
    var pluginReference: kotlin.String? = null,
)
