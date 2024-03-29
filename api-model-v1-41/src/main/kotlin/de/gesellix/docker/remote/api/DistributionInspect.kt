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
 * Describes the result obtained from contacting the registry to retrieve image metadata.
 *
 * @param descriptor
 * @param platforms An array containing all platforms supported by the image.
 */
@JsonClass(generateAdapter = true)
data class DistributionInspect(
    @Json(name = "Descriptor")
    var descriptor: OCIDescriptor,
    // An array containing all platforms supported by the image.
    @Json(name = "Platforms")
    var platforms: kotlin.collections.MutableList<OCIPlatform>,
)
