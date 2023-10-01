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
    "UnusedImport"
)

package de.gesellix.docker.remote.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Orchestration configuration.
 *
 * @param taskHistoryRetentionLimit The number of historic tasks to keep per instance or node. If negative, never remove completed or failed tasks.
 */
@JsonClass(generateAdapter = true)

data class SwarmSpecOrchestration(

    /* The number of historic tasks to keep per instance or node. If negative, never remove completed or failed tasks.  */
    @Json(name = "TaskHistoryRetentionLimit")
    var taskHistoryRetentionLimit: kotlin.Long? = null

)
