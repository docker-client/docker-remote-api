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
 * The log driver to use for tasks created in the orchestrator if unspecified by a service.  Updating this value only affects new tasks. Existing tasks continue to use their previously configured log driver until recreated.
 *
 * @param name The log driver to use as a default for new tasks.
 * @param options Driver-specific options for the selectd log driver, specified as key/value pairs.
 */
@JsonClass(generateAdapter = true)

data class SwarmSpecTaskDefaultsLogDriver(

  /* The log driver to use as a default for new tasks.  */
  @Json(name = "Name")
  var name: kotlin.String? = null,

  /* Driver-specific options for the selectd log driver, specified as key/value pairs.  */
  @Json(name = "Options")
  var options: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null

)
