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
 * Optional configuration for the `volume` type.
 *
 * @param noCopy Populate volume with data from the target.
 * @param labels User-defined key/value metadata.
 * @param driverConfig
 * @param subpath Source path inside the volume. Must be relative without any back traversals.
 */
@JsonClass(generateAdapter = true)
data class MountVolumeOptions(
    // Populate volume with data from the target.
    @Json(name = "NoCopy")
    var noCopy: kotlin.Boolean? = false,
    // User-defined key/value metadata.
    @Json(name = "Labels")
    var labels: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,
    @Json(name = "DriverConfig")
    var driverConfig: MountVolumeOptionsDriverConfig? = null,
    // Source path inside the volume. Must be relative without any back traversals.
    @Json(name = "Subpath")
    var subpath: kotlin.String? = null,
)
