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
 * Represents generic information about swarm.
 *
 * @param nodeID Unique identifier of for this node in the swarm.
 * @param nodeAddr IP address at which this node can be reached by other nodes in the swarm.
 * @param localNodeState
 * @param controlAvailable
 * @param error
 * @param remoteManagers List of ID's and addresses of other managers in the swarm.
 * @param nodes Total number of nodes in the swarm.
 * @param managers Total number of managers in the swarm.
 * @param cluster
 */
@JsonClass(generateAdapter = true)

data class SwarmInfo(

  /* Unique identifier of for this node in the swarm. */
  @Json(name = "NodeID")
  var nodeID: kotlin.String? = "",

  /* IP address at which this node can be reached by other nodes in the swarm.  */
  @Json(name = "NodeAddr")
  var nodeAddr: kotlin.String? = "",

  @Json(name = "LocalNodeState")
  var localNodeState: LocalNodeState? = LocalNodeState.EMPTY,

  @Json(name = "ControlAvailable")
  var controlAvailable: kotlin.Boolean? = false,

  @Json(name = "Error")
  var error: kotlin.String? = "",

  /* List of ID's and addresses of other managers in the swarm.  */
  @Json(name = "RemoteManagers")
  var remoteManagers: kotlin.collections.MutableList<PeerNode>? = null,

  /* Total number of nodes in the swarm. */
  @Json(name = "Nodes")
  var nodes: kotlin.Int? = null,

  /* Total number of managers in the swarm. */
  @Json(name = "Managers")
  var managers: kotlin.Int? = null,

  @Json(name = "Cluster")
  var cluster: ClusterInfo? = null

)
