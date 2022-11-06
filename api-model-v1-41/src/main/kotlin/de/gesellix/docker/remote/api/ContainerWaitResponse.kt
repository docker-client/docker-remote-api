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
 * OK response to ContainerWait operation
 *
 * @param statusCode Exit code of the container
 * @param error
 */
@JsonClass(generateAdapter = true)

data class ContainerWaitResponse(

  /* Exit code of the container */
  @Json(name = "StatusCode")
  var statusCode: kotlin.Long,

  @Json(name = "Error")
  var error: ContainerWaitExitError? = null

)
