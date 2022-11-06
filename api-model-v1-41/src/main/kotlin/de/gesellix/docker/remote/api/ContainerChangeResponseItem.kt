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
 * change item in response to ContainerChanges operation
 *
 * @param path Path to file that has changed
 * @param kind Kind of change
 */
@JsonClass(generateAdapter = true)

data class ContainerChangeResponseItem(

  /* Path to file that has changed */
  @Json(name = "Path")
  var path: kotlin.String,

  /* Kind of change */
  @Json(name = "Kind")
  var kind: kotlin.Int

)
