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

/**
 *
 *
 * Values: New,Allocated,Pending,Assigned,Accepted,Preparing,Ready,Starting,Running,Complete,Shutdown,Failed,Rejected,Remove,Orphaned
 */

enum class TaskState(val value: kotlin.String) {

  @Json(name = "new")
  New("new"),

  @Json(name = "allocated")
  Allocated("allocated"),

  @Json(name = "pending")
  Pending("pending"),

  @Json(name = "assigned")
  Assigned("assigned"),

  @Json(name = "accepted")
  Accepted("accepted"),

  @Json(name = "preparing")
  Preparing("preparing"),

  @Json(name = "ready")
  Ready("ready"),

  @Json(name = "starting")
  Starting("starting"),

  @Json(name = "running")
  Running("running"),

  @Json(name = "complete")
  Complete("complete"),

  @Json(name = "shutdown")
  Shutdown("shutdown"),

  @Json(name = "failed")
  Failed("failed"),

  @Json(name = "rejected")
  Rejected("rejected"),

  @Json(name = "remove")
  Remove("remove"),

  @Json(name = "orphaned")
  Orphaned("orphaned");

  /**
   * Override toString() to avoid using the enum variable name as the value, and instead use
   * the actual value defined in the API spec file.
   *
   * This solves a problem when the variable name and its value are different, and ensures that
   * the client sends the correct enum values to the server always.
   */
  override fun toString(): String = value

  companion object {
    /**
     * Converts the provided [data] to a [String] on success, null otherwise.
     */
    fun encode(data: kotlin.Any?): kotlin.String? = if (data is TaskState) "$data" else null

    /**
     * Returns a valid [TaskState] for [data], null otherwise.
     */
    fun decode(data: kotlin.Any?): TaskState? = data?.let {
      val normalizedData = "$it".lowercase()
      values().firstOrNull { value ->
        it == value || normalizedData == "$value".lowercase()
      }
    }
  }
}
