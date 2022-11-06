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
 * container waiting error, if any
 *
 * @param message Details of an error
 */
@JsonClass(generateAdapter = true)

data class ContainerWaitExitError(

  /* Details of an error */
  @Json(name = "Message")
  var message: kotlin.String? = null

)
