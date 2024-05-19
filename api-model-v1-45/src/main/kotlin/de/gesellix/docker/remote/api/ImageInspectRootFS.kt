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
 * Information about the image's RootFS, including the layer IDs.
 *
 * @param type
 * @param layers
 */
@JsonClass(generateAdapter = true)
data class ImageInspectRootFS(
    @Json(name = "Type")
    var type: kotlin.String,
    @Json(name = "Layers")
    var layers: kotlin.collections.MutableList<kotlin.String>? = null,
)
