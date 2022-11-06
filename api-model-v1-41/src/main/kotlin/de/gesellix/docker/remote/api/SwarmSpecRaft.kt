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
 * Raft configuration.
 *
 * @param snapshotInterval The number of log entries between snapshots.
 * @param keepOldSnapshots The number of snapshots to keep beyond the current snapshot.
 * @param logEntriesForSlowFollowers The number of log entries to keep around to sync up slow followers after a snapshot is created.
 * @param electionTick The number of ticks that a follower will wait for a message from the leader before becoming a candidate and starting an election. `ElectionTick` must be greater than `HeartbeatTick`.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed.
 * @param heartbeatTick The number of ticks between heartbeats. Every HeartbeatTick ticks, the leader will send a heartbeat to the followers.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed.
 */
@JsonClass(generateAdapter = true)

data class SwarmSpecRaft(

  /* The number of log entries between snapshots. */
  @Json(name = "SnapshotInterval")
  var snapshotInterval: kotlin.Int? = null,

  /* The number of snapshots to keep beyond the current snapshot.  */
  @Json(name = "KeepOldSnapshots")
  var keepOldSnapshots: kotlin.Int? = null,

  /* The number of log entries to keep around to sync up slow followers after a snapshot is created.  */
  @Json(name = "LogEntriesForSlowFollowers")
  var logEntriesForSlowFollowers: kotlin.Int? = null,

  /* The number of ticks that a follower will wait for a message from the leader before becoming a candidate and starting an election. `ElectionTick` must be greater than `HeartbeatTick`.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed.  */
  @Json(name = "ElectionTick")
  var electionTick: kotlin.Int? = null,

  /* The number of ticks between heartbeats. Every HeartbeatTick ticks, the leader will send a heartbeat to the followers.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed.  */
  @Json(name = "HeartbeatTick")
  var heartbeatTick: kotlin.Int? = null

)
