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
 * @param timestamp
 * @param state
 * @param message
 * @param err
 * @param containerStatus
 */
@JsonClass(generateAdapter = true)
data class TaskStatus(
    @Json(name = "Timestamp")
    var timestamp: kotlin.String? = null,
    @Json(name = "State")
    var state: TaskState? = null,
    @Json(name = "Message")
    var message: kotlin.String? = null,
    @Json(name = "Err")
    var err: kotlin.String? = null,
    @Json(name = "ContainerStatus")
    var containerStatus: TaskStatusContainerStatus? = null,
)
