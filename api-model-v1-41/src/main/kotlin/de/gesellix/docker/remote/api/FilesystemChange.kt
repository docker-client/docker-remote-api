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
 * Change in the container's filesystem.
 *
 * @param path Path to file or directory that has changed.
 * @param kind
 */
@JsonClass(generateAdapter = true)
data class FilesystemChange(
    // Path to file or directory that has changed.
    @Json(name = "Path")
    var path: kotlin.String,
    @Json(name = "Kind")
    var kind: ChangeType,
)
