
# Network

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Name of the network.  |  [optional] |
| **id** | **kotlin.String** | ID that uniquely identifies a network on a single machine.  |  [optional] |
| **created** | **kotlin.String** | Date and time at which the network was created in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  |  [optional] |
| **scope** | **kotlin.String** | The level at which the network exists (e.g. &#x60;swarm&#x60; for cluster-wide or &#x60;local&#x60; for machine level)  |  [optional] |
| **driver** | **kotlin.String** | The name of the driver used to create the network (e.g. &#x60;bridge&#x60;, &#x60;overlay&#x60;).  |  [optional] |
| **enableIPv6** | **kotlin.Boolean** | Whether the network was created with IPv6 enabled.  |  [optional] |
| **IPAM** | [**IPAM**](IPAM.md) |  |  [optional] |
| **&#x60;internal&#x60;** | **kotlin.Boolean** | Whether the network is created to only allow internal networking connectivity.  |  [optional] |
| **attachable** | **kotlin.Boolean** | Whether a global / swarm scope network is manually attachable by regular containers from workers in swarm mode.  |  [optional] |
| **ingress** | **kotlin.Boolean** | Whether the network is providing the routing-mesh for the swarm cluster.  |  [optional] |
| **configFrom** | [**ConfigReference**](ConfigReference.md) |  |  [optional] |
| **configOnly** | **kotlin.Boolean** | Whether the network is a config-only network. Config-only networks are placeholder networks for network configurations to be used by other networks. Config-only networks cannot be used directly to run containers or services.  |  [optional] |
| **containers** | [**kotlin.collections.MutableMap&lt;kotlin.String, NetworkContainer&gt;**](NetworkContainer.md) | Contains endpoints attached to the network.  |  [optional] |
| **options** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | Network-specific options uses when creating the network.  |  [optional] |
| **labels** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | User-defined key/value metadata. |  [optional] |
| **peers** | [**kotlin.collections.MutableList&lt;PeerInfo&gt;**](PeerInfo.md) | List of peer nodes for an overlay network. This field is only present for overlay networks, and omitted for other network types.  |  [optional] |



