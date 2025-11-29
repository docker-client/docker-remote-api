
# EndpointSettings

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ipAMConfig** | [**EndpointIPAMConfig**](EndpointIPAMConfig.md) |  |  [optional] |
| **links** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** |  |  [optional] |
| **macAddress** | **kotlin.String** | MAC address for the endpoint on this network. The network driver might ignore this parameter.  |  [optional] |
| **aliases** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** |  |  [optional] |
| **driverOpts** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | DriverOpts is a mapping of driver options and values. These options are passed directly to the driver and are driver specific.  |  [optional] |
| **gwPriority** | **kotlin.Long** | This property determines which endpoint will provide the default gateway for a container. The endpoint with the highest priority will be used. If multiple endpoints have the same priority, endpoints are lexicographically sorted based on their network name, and the one that sorts first is picked.  |  [optional] |
| **networkID** | **kotlin.String** | Unique ID of the network.  |  [optional] |
| **endpointID** | **kotlin.String** | Unique ID for the service endpoint in a Sandbox.  |  [optional] |
| **gateway** | **kotlin.String** | Gateway address for this network.  |  [optional] |
| **ipAddress** | **kotlin.String** | IPv4 address.  |  [optional] |
| **ipPrefixLen** | **kotlin.Int** | Mask length of the IPv4 address.  |  [optional] |
| **ipv6Gateway** | **kotlin.String** | IPv6 gateway address.  |  [optional] |
| **globalIPv6Address** | **kotlin.String** | Global IPv6 address.  |  [optional] |
| **globalIPv6PrefixLen** | **kotlin.Long** | Mask length of the global IPv6 address.  |  [optional] |
| **dnSNames** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | List of all DNS names an endpoint has on a specific network. This list is based on the container name, network aliases, container short ID, and hostname.  These DNS names are non-fully qualified but can contain several dots. You can get fully qualified DNS names by appending &#x60;.&lt;network-name&gt;&#x60;. For instance, if container name is &#x60;my.ctr&#x60; and the network is named &#x60;testnet&#x60;, &#x60;DNSNames&#x60; will contain &#x60;my.ctr&#x60; and the FQDN will be &#x60;my.ctr.testnet&#x60;.  |  [optional] |



