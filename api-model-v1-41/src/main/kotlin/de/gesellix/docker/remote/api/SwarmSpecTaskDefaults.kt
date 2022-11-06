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
 * Defaults for creating tasks in this cluster.
 *
 * @param logDriver
 */
@JsonClass(generateAdapter = true)

data class SwarmSpecTaskDefaults(

  @Json(name = "LogDriver")
  var logDriver: SwarmSpecTaskDefaultsLogDriver? = null

)
