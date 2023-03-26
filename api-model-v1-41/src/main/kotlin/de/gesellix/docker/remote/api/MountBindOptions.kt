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
 * Optional configuration for the `bind` type.
 *
 * @param propagation A propagation mode with the value `[r]private`, `[r]shared`, or `[r]slave`.
 * @param nonRecursive Disable recursive bind mount.
 */
@JsonClass(generateAdapter = true)

data class MountBindOptions(

  /* A propagation mode with the value `[r]private`, `[r]shared`, or `[r]slave`. */
  @Json(name = "Propagation")
  var propagation: MountBindOptions.Propagation? = null,

  /* Disable recursive bind mount. */
  @Json(name = "NonRecursive")
  var nonRecursive: kotlin.Boolean? = false

) {

  /**
   * A propagation mode with the value `[r]private`, `[r]shared`, or `[r]slave`.
   *
   * Values: Private,Rprivate,Shared,Rshared,Slave,Rslave
   */
  enum class Propagation(val value: kotlin.String) {

    @Json(name = "private")
    Private("private"),

    @Json(name = "rprivate")
    Rprivate("rprivate"),

    @Json(name = "shared")
    Shared("shared"),

    @Json(name = "rshared")
    Rshared("rshared"),

    @Json(name = "slave")
    Slave("slave"),

    @Json(name = "rslave")
    Rslave("rslave");
  }
}
