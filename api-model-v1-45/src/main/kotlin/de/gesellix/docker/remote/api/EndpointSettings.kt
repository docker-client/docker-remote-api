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
 * Configuration for a network endpoint.
 *
 * @param ipAMConfig
 * @param links
 * @param macAddress MAC address for the endpoint on this network. The network driver might ignore this parameter.
 * @param aliases
 * @param networkID Unique ID of the network.
 * @param endpointID Unique ID for the service endpoint in a Sandbox.
 * @param gateway Gateway address for this network.
 * @param ipAddress IPv4 address.
 * @param ipPrefixLen Mask length of the IPv4 address.
 * @param ipv6Gateway IPv6 gateway address.
 * @param globalIPv6Address Global IPv6 address.
 * @param globalIPv6PrefixLen Mask length of the global IPv6 address.
 * @param driverOpts DriverOpts is a mapping of driver options and values. These options are passed directly to the driver and are driver specific.
 * @param dnSNames List of all DNS names an endpoint has on a specific network. This list is based on the container name, network aliases, container short ID, and hostname.  These DNS names are non-fully qualified but can contain several dots. You can get fully qualified DNS names by appending `.<network-name>`. For instance, if container name is `my.ctr` and the network is named `testnet`, `DNSNames` will contain `my.ctr` and the FQDN will be `my.ctr.testnet`.
 */
@JsonClass(generateAdapter = true)
data class EndpointSettings(
    @Json(name = "IPAMConfig")
    var ipAMConfig: EndpointIPAMConfig? = null,
    @Json(name = "Links")
    var links: kotlin.collections.MutableList<kotlin.String>? = null,
    // MAC address for the endpoint on this network. The network driver might ignore this parameter.
    @Json(name = "MacAddress")
    var macAddress: kotlin.String? = null,
    @Json(name = "Aliases")
    var aliases: kotlin.collections.MutableList<kotlin.String>? = null,
    // Unique ID of the network.
    @Json(name = "NetworkID")
    var networkID: kotlin.String? = null,
    // Unique ID for the service endpoint in a Sandbox.
    @Json(name = "EndpointID")
    var endpointID: kotlin.String? = null,
    // Gateway address for this network.
    @Json(name = "Gateway")
    var gateway: kotlin.String? = null,
    // IPv4 address.
    @Json(name = "IPAddress")
    var ipAddress: kotlin.String? = null,
    // Mask length of the IPv4 address.
    @Json(name = "IPPrefixLen")
    var ipPrefixLen: kotlin.Int? = null,
    // IPv6 gateway address.
    @Json(name = "IPv6Gateway")
    var ipv6Gateway: kotlin.String? = null,
    // Global IPv6 address.
    @Json(name = "GlobalIPv6Address")
    var globalIPv6Address: kotlin.String? = null,
    // Mask length of the global IPv6 address.
    @Json(name = "GlobalIPv6PrefixLen")
    var globalIPv6PrefixLen: kotlin.Long? = null,
    // DriverOpts is a mapping of driver options and values. These options are passed directly to the driver and are driver specific.
    @Json(name = "DriverOpts")
    var driverOpts: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,
    // List of all DNS names an endpoint has on a specific network. This list is based on the container name, network aliases, container short ID, and hostname.  These DNS names are non-fully qualified but can contain several dots. You can get fully qualified DNS names by appending `.<network-name>`. For instance, if container name is `my.ctr` and the network is named `testnet`, `DNSNames` will contain `my.ctr` and the FQDN will be `my.ctr.testnet`.
    @Json(name = "DNSNames")
    var dnSNames: kotlin.collections.MutableList<kotlin.String>? = null,
)
