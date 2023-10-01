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
 * Map of driver specific options
 *
 * @param name Name of the driver to use to create the volume.
 * @param options key/value map of driver specific options.
 */
@JsonClass(generateAdapter = true)

data class MountVolumeOptionsDriverConfig(

    /* Name of the driver to use to create the volume. */
    @Json(name = "Name")
    var name: kotlin.String? = null,

    /* key/value map of driver specific options. */
    @Json(name = "Options")
    var options: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null

)
