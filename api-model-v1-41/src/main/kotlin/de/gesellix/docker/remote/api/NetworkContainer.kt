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
 * @param name
 * @param endpointID
 * @param macAddress
 * @param ipv4Address
 * @param ipv6Address
 */
@JsonClass(generateAdapter = true)

data class NetworkContainer(

    @Json(name = "Name")
    var name: kotlin.String? = null,

    @Json(name = "EndpointID")
    var endpointID: kotlin.String? = null,

    @Json(name = "MacAddress")
    var macAddress: kotlin.String? = null,

    @Json(name = "IPv4Address")
    var ipv4Address: kotlin.String? = null,

    @Json(name = "IPv6Address")
    var ipv6Address: kotlin.String? = null

)
