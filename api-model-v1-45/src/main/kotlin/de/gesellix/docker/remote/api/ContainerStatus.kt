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
 * represents the status of a container.
 *
 * @param containerID
 * @param PID
 * @param exitCode
 */
@JsonClass(generateAdapter = true)
data class ContainerStatus(
    @Json(name = "ContainerID")
    var containerID: kotlin.String? = null,
    @Json(name = "PID")
    var PID: kotlin.Int? = null,
    @Json(name = "ExitCode")
    var exitCode: kotlin.Int? = null,
)
