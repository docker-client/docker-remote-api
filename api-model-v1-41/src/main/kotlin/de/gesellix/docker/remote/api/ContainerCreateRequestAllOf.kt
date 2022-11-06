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
 * @param hostConfig
 * @param networkingConfig
 */
@JsonClass(generateAdapter = true)

data class ContainerCreateRequestAllOf(

  @Json(name = "HostConfig")
  var hostConfig: HostConfig? = null,

  @Json(name = "NetworkingConfig")
  var networkingConfig: NetworkingConfig? = null

)
