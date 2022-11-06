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
 *
 *
 * @param name Name of ulimit
 * @param soft Soft limit
 * @param hard Hard limit
 */
@JsonClass(generateAdapter = true)

data class ResourcesUlimitsInner(

  /* Name of ulimit */
  @Json(name = "Name")
  var name: kotlin.String? = null,

  /* Soft limit */
  @Json(name = "Soft")
  var soft: kotlin.Int? = null,

  /* Hard limit */
  @Json(name = "Hard")
  var hard: kotlin.Int? = null

)
