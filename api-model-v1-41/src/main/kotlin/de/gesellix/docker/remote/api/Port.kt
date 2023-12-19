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
 * An open port on a container
 *
 * @param privatePort Port on the container
 * @param type
 * @param IP Host IP address that the container's port is mapped to
 * @param publicPort Port exposed on the host
 */
@JsonClass(generateAdapter = true)
data class Port(
    // Port on the container
    @Json(name = "PrivatePort")
    var privatePort: kotlin.Int,
    @Json(name = "Type")
    var type: Port.Type,
    // Host IP address that the container's port is mapped to
    @Json(name = "IP")
    var IP: kotlin.String? = null,
    // Port exposed on the host
    @Json(name = "PublicPort")
    var publicPort: kotlin.Int? = null,
) {
    /**
     *
     *
     * Values: Tcp,Udp,Sctp
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "tcp")
        Tcp("tcp"),

        @Json(name = "udp")
        Udp("udp"),

        @Json(name = "sctp")
        Sctp("sctp"),
    }
}
