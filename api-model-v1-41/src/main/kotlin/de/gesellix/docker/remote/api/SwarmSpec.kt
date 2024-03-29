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
 * User modifiable swarm configuration.
 *
 * @param name Name of the swarm.
 * @param labels User-defined key/value metadata.
 * @param orchestration
 * @param raft
 * @param dispatcher
 * @param caConfig
 * @param encryptionConfig
 * @param taskDefaults
 */
@JsonClass(generateAdapter = true)
data class SwarmSpec(
    // Name of the swarm.
    @Json(name = "Name")
    var name: kotlin.String? = null,
    // User-defined key/value metadata.
    @Json(name = "Labels")
    var labels: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,
    @Json(name = "Orchestration")
    var orchestration: SwarmSpecOrchestration? = null,
    @Json(name = "Raft")
    var raft: SwarmSpecRaft? = null,
    @Json(name = "Dispatcher")
    var dispatcher: SwarmSpecDispatcher? = null,
    @Json(name = "CAConfig")
    var caConfig: SwarmSpecCAConfig? = null,
    @Json(name = "EncryptionConfig")
    var encryptionConfig: SwarmSpecEncryptionConfig? = null,
    @Json(name = "TaskDefaults")
    var taskDefaults: SwarmSpecTaskDefaults? = null,
)
