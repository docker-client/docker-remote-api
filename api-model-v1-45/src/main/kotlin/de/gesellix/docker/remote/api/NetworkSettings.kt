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
 * NetworkSettings exposes the network settings in the API
 *
 * @param bridge Name of the default bridge interface when dockerd's --bridge flag is set.
 * @param sandboxID SandboxID uniquely represents a container's network stack.
 * @param hairpinMode Indicates if hairpin NAT should be enabled on the virtual interface.  Deprecated: This field is never set and will be removed in a future release.
 * @param linkLocalIPv6Address IPv6 unicast address using the link-local prefix.  Deprecated: This field is never set and will be removed in a future release.
 * @param linkLocalIPv6PrefixLen Prefix length of the IPv6 unicast address.  Deprecated: This field is never set and will be removed in a future release.
 * @param ports PortMap describes the mapping of container ports to host ports, using the container's port-number and protocol as key in the format `<port>/<protocol>`, for example, `80/udp`.  If a container's port is mapped for multiple protocols, separate entries are added to the mapping table.
 * @param sandboxKey SandboxKey is the full path of the netns handle
 * @param secondaryIPAddresses Deprecated: This field is never set and will be removed in a future release.
 * @param secondaryIPv6Addresses Deprecated: This field is never set and will be removed in a future release.
 * @param endpointID EndpointID uniquely represents a service endpoint in a Sandbox.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
 * @param gateway Gateway address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
 * @param globalIPv6Address Global IPv6 address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
 * @param globalIPv6PrefixLen Mask length of the global IPv6 address.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
 * @param ipAddress IPv4 address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
 * @param ipPrefixLen Mask length of the IPv4 address.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
 * @param ipv6Gateway IPv6 gateway address for this network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
 * @param macAddress MAC address for the container on the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
 * @param networks Information about all networks that the container is connected to.
 */
@JsonClass(generateAdapter = true)
data class NetworkSettings(
    // Name of the default bridge interface when dockerd's --bridge flag is set.
    @Json(name = "Bridge")
    var bridge: kotlin.String? = null,
    // SandboxID uniquely represents a container's network stack.
    @Json(name = "SandboxID")
    var sandboxID: kotlin.String? = null,
    // Indicates if hairpin NAT should be enabled on the virtual interface.  Deprecated: This field is never set and will be removed in a future release.
    @Json(name = "HairpinMode")
    var hairpinMode: kotlin.Boolean? = null,
    // IPv6 unicast address using the link-local prefix.  Deprecated: This field is never set and will be removed in a future release.
    @Json(name = "LinkLocalIPv6Address")
    var linkLocalIPv6Address: kotlin.String? = null,
    // Prefix length of the IPv6 unicast address.  Deprecated: This field is never set and will be removed in a future release.
    @Json(name = "LinkLocalIPv6PrefixLen")
    var linkLocalIPv6PrefixLen: kotlin.Int? = null,
    // PortMap describes the mapping of container ports to host ports, using the container's port-number and protocol as key in the format `<port>/<protocol>`, for example, `80/udp`.  If a container's port is mapped for multiple protocols, separate entries are added to the mapping table.
    @Json(name = "Ports")
    var ports: kotlin.collections.MutableMap<kotlin.String, kotlin.collections.MutableList<PortBinding>>? = null,
    // SandboxKey is the full path of the netns handle
    @Json(name = "SandboxKey")
    var sandboxKey: kotlin.String? = null,
    // Deprecated: This field is never set and will be removed in a future release.
    @Json(name = "SecondaryIPAddresses")
    var secondaryIPAddresses: kotlin.collections.MutableList<Address>? = null,
    // Deprecated: This field is never set and will be removed in a future release.
    @Json(name = "SecondaryIPv6Addresses")
    var secondaryIPv6Addresses: kotlin.collections.MutableList<Address>? = null,
    // EndpointID uniquely represents a service endpoint in a Sandbox.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
    @Json(name = "EndpointID")
    var endpointID: kotlin.String? = null,
    // Gateway address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
    @Json(name = "Gateway")
    var gateway: kotlin.String? = null,
    // Global IPv6 address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
    @Json(name = "GlobalIPv6Address")
    var globalIPv6Address: kotlin.String? = null,
    // Mask length of the global IPv6 address.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
    @Json(name = "GlobalIPv6PrefixLen")
    var globalIPv6PrefixLen: kotlin.Int? = null,
    // IPv4 address for the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
    @Json(name = "IPAddress")
    var ipAddress: kotlin.String? = null,
    // Mask length of the IPv4 address.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
    @Json(name = "IPPrefixLen")
    var ipPrefixLen: kotlin.Int? = null,
    // IPv6 gateway address for this network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
    @Json(name = "IPv6Gateway")
    var ipv6Gateway: kotlin.String? = null,
    // MAC address for the container on the default \"bridge\" network.  <p><br /></p>  > **Deprecated**: This field is only propagated when attached to the > default \"bridge\" network. Use the information from the \"bridge\" > network inside the `Networks` map instead, which contains the same > information. This field was deprecated in Docker 1.9 and is scheduled > to be removed in Docker 17.12.0
    @Json(name = "MacAddress")
    var macAddress: kotlin.String? = null,
    // Information about all networks that the container is connected to.
    @Json(name = "Networks")
    var networks: kotlin.collections.MutableMap<kotlin.String, EndpointSettings>? = null,
)