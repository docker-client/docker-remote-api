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
 * @param name User-defined name of the secret.
 * @param labels User-defined key/value metadata.
 * @param `data` Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) data to store as secret.  This field is only used to _create_ a secret, and is not returned by other endpoints.
 * @param driver
 * @param templating
 */
@JsonClass(generateAdapter = true)

data class SecretCreateRequest(

  /* User-defined name of the secret. */
  @Json(name = "Name")
  var name: kotlin.String? = null,

  /* User-defined key/value metadata. */
  @Json(name = "Labels")
  var labels: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,

  /* Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) data to store as secret.  This field is only used to _create_ a secret, and is not returned by other endpoints.  */
  @Json(name = "Data")
  var `data`: kotlin.String? = null,

  @Json(name = "Driver")
  var driver: Driver? = null,

  @Json(name = "Templating")
  var templating: Driver? = null

)
