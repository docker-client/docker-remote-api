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
 * @param cachesDeleted
 * @param spaceReclaimed Disk space reclaimed in bytes
 */
@JsonClass(generateAdapter = true)
data class BuildPruneResponse(
    @Json(name = "CachesDeleted")
    var cachesDeleted: kotlin.collections.MutableList<kotlin.String>? = null,
    // Disk space reclaimed in bytes
    @Json(name = "SpaceReclaimed")
    var spaceReclaimed: kotlin.Long? = null,
)