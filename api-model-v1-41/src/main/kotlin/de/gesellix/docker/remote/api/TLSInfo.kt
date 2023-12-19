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
    "UnusedImport",
)

package de.gesellix.docker.remote.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Information about the issuer of leaf TLS certificates and the trusted root CA certificate.
 *
 * @param trustRoot The root CA certificate(s) that are used to validate leaf TLS certificates.
 * @param certIssuerSubject The base64-url-safe-encoded raw subject bytes of the issuer.
 * @param certIssuerPublicKey The base64-url-safe-encoded raw public key bytes of the issuer.
 */
@JsonClass(generateAdapter = true)
data class TLSInfo(
    // The root CA certificate(s) that are used to validate leaf TLS certificates.
    @Json(name = "TrustRoot")
    var trustRoot: kotlin.String? = null,
    // The base64-url-safe-encoded raw subject bytes of the issuer.
    @Json(name = "CertIssuerSubject")
    var certIssuerSubject: kotlin.String? = null,
    // The base64-url-safe-encoded raw public key bytes of the issuer.
    @Json(name = "CertIssuerPublicKey")
    var certIssuerPublicKey: kotlin.String? = null,
)
