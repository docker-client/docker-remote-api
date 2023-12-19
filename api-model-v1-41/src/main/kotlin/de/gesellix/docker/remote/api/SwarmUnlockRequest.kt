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
 * @param unlockKey The swarm's unlock key.
 */
@JsonClass(generateAdapter = true)
data class SwarmUnlockRequest(
    // The swarm's unlock key.
    @Json(name = "UnlockKey")
    var unlockKey: kotlin.String? = null,
)
