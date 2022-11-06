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
 * CA configuration.
 *
 * @param nodeCertExpiry The duration node certificates are issued for.
 * @param externalCAs Configuration for forwarding signing requests to an external certificate authority.
 * @param signingCACert The desired signing CA certificate for all swarm node TLS leaf certificates, in PEM format.
 * @param signingCAKey The desired signing CA key for all swarm node TLS leaf certificates, in PEM format.
 * @param forceRotate An integer whose purpose is to force swarm to generate a new signing CA certificate and key, if none have been specified in `SigningCACert` and `SigningCAKey`
 */
@JsonClass(generateAdapter = true)

data class SwarmSpecCAConfig(

  /* The duration node certificates are issued for. */
  @Json(name = "NodeCertExpiry")
  var nodeCertExpiry: kotlin.Long? = null,

  /* Configuration for forwarding signing requests to an external certificate authority.  */
  @Json(name = "ExternalCAs")
  var externalCAs: kotlin.collections.MutableList<SwarmSpecCAConfigExternalCAsInner>? = null,

  /* The desired signing CA certificate for all swarm node TLS leaf certificates, in PEM format.  */
  @Json(name = "SigningCACert")
  var signingCACert: kotlin.String? = null,

  /* The desired signing CA key for all swarm node TLS leaf certificates, in PEM format.  */
  @Json(name = "SigningCAKey")
  var signingCAKey: kotlin.String? = null,

  /* An integer whose purpose is to force swarm to generate a new signing CA certificate and key, if none have been specified in `SigningCACert` and `SigningCAKey`  */
  @Json(name = "ForceRotate")
  var forceRotate: kotlin.Int? = null

)
