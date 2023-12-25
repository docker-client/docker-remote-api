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
 * represents the port status of a task's host ports whose service has published host ports
 *
 * @param ports
 */
@JsonClass(generateAdapter = true)
data class PortStatus(
    @Json(name = "Ports")
    var ports: kotlin.collections.MutableList<EndpointPortConfig>? = null,
)