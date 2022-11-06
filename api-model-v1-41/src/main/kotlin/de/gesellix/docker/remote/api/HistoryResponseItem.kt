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
 * individual image layer information in response to ImageHistory operation
 *
 * @param id
 * @param created
 * @param createdBy
 * @param tags
 * @param propertySize
 * @param comment
 */
@JsonClass(generateAdapter = true)

data class HistoryResponseItem(

  @Json(name = "Id")
  var id: kotlin.String,

  @Json(name = "Created")
  var created: kotlin.Long,

  @Json(name = "CreatedBy")
  var createdBy: kotlin.String,

  @Json(name = "Tags")
  var tags: kotlin.collections.MutableList<kotlin.String>?,

  @Json(name = "Size")
  var propertySize: kotlin.Long,

  @Json(name = "Comment")
  var comment: kotlin.String

)
