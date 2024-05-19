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
 * ManagerStatus represents the status of a manager.  It provides the current status of a node's manager component, if the node is a manager.
 *
 * @param leader
 * @param reachability
 * @param addr The IP address and port at which the manager is reachable.
 */
@JsonClass(generateAdapter = true)
data class ManagerStatus(
    @Json(name = "Leader")
    var leader: kotlin.Boolean? = false,
    @Json(name = "Reachability")
    var reachability: Reachability? = null,
    // The IP address and port at which the manager is reachable.
    @Json(name = "Addr")
    var addr: kotlin.String? = null,
)
