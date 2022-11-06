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
 * @param protocol Protocol for communication with the external CA (currently only `cfssl` is supported).
 * @param URL URL where certificate signing requests should be sent.
 * @param options An object with key/value pairs that are interpreted as protocol-specific options for the external CA driver.
 * @param caCert The root CA certificate (in PEM format) this external CA uses to issue TLS certificates (assumed to be to the current swarm root CA certificate if not provided).
 */
@JsonClass(generateAdapter = true)

data class SwarmSpecCAConfigExternalCAsInner(

  /* Protocol for communication with the external CA (currently only `cfssl` is supported).  */
  @Json(name = "Protocol")
  var protocol: SwarmSpecCAConfigExternalCAsInner.Protocol? = Protocol.Cfssl,

  /* URL where certificate signing requests should be sent.  */
  @Json(name = "URL")
  var URL: kotlin.String? = null,

  /* An object with key/value pairs that are interpreted as protocol-specific options for the external CA driver.  */
  @Json(name = "Options")
  var options: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,

  /* The root CA certificate (in PEM format) this external CA uses to issue TLS certificates (assumed to be to the current swarm root CA certificate if not provided).  */
  @Json(name = "CACert")
  var caCert: kotlin.String? = null

) {

  /**
   * Protocol for communication with the external CA (currently only `cfssl` is supported).
   *
   * Values: Cfssl
   */
  enum class Protocol(val value: kotlin.String) {
    @Json(name = "cfssl") Cfssl("cfssl");
  }
}
