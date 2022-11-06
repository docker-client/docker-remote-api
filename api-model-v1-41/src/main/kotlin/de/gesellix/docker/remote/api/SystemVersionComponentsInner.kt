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
 * @param name Name of the component
 * @param version Version of the component
 * @param details Key/value pairs of strings with additional information about the component. These values are intended for informational purposes only, and their content is not defined, and not part of the API specification.  These messages can be printed by the client as information to the user.
 */
@JsonClass(generateAdapter = true)

data class SystemVersionComponentsInner(

  /* Name of the component  */
  @Json(name = "Name")
  var name: kotlin.String,

  /* Version of the component  */
  @Json(name = "Version")
  var version: kotlin.String,

  /* Key/value pairs of strings with additional information about the component. These values are intended for informational purposes only, and their content is not defined, and not part of the API specification.  These messages can be printed by the client as information to the user.  */
  @Json(name = "Details")
  var details: kotlin.Any? = null

)
