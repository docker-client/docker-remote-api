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
 * @param layersSize
 * @param images
 * @param containers
 * @param volumes
 * @param buildCache
 */
@JsonClass(generateAdapter = true)
data class SystemDataUsageResponse(
    @Json(name = "LayersSize")
    var layersSize: kotlin.Long? = null,
    @Json(name = "Images")
    var images: kotlin.collections.MutableList<ImageSummary>? = null,
    @Json(name = "Containers")
    var containers: kotlin.collections.MutableList<ContainerSummary>? = null,
    @Json(name = "Volumes")
    var volumes: kotlin.collections.MutableList<Volume>? = null,
    @Json(name = "BuildCache")
    var buildCache: kotlin.collections.MutableList<BuildCache>? = null,
)
