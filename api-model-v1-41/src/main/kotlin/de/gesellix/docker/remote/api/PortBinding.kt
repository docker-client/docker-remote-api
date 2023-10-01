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
 * PortBinding represents a binding between a host IP address and a host port.
 *
 * @param hostIp Host IP address that the container's port is mapped to.
 * @param hostPort Host port number that the container's port is mapped to.
 */
@JsonClass(generateAdapter = true)

data class PortBinding(

    /* Host IP address that the container's port is mapped to. */
    @Json(name = "HostIp")
    var hostIp: kotlin.String? = null,

    /* Host port number that the container's port is mapped to. */
    @Json(name = "HostPort")
    var hostPort: kotlin.String? = null

)
