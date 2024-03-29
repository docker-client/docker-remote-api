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
 * NodeStatus represents the status of a node.  It provides the current status of the node, as seen by the manager.
 *
 * @param state
 * @param message
 * @param addr IP address of the node.
 */
@JsonClass(generateAdapter = true)
data class NodeStatus(
    @Json(name = "State")
    var state: NodeState? = null,
    @Json(name = "Message")
    var message: kotlin.String? = null,
    // IP address of the node.
    @Json(name = "Addr")
    var addr: kotlin.String? = null,
)
