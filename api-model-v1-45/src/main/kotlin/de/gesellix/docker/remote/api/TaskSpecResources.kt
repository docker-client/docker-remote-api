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
 * Resource requirements which apply to each individual container created as part of the service.
 *
 * @param limits
 * @param reservations
 */
@JsonClass(generateAdapter = true)
data class TaskSpecResources(
    @Json(name = "Limits")
    var limits: Limit? = null,
    @Json(name = "Reservations")
    var reservations: ResourceObject? = null,
)
