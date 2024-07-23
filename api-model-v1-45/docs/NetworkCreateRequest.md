
# NetworkCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | The network&#39;s name. |  |
| **checkDuplicate** | **kotlin.Boolean** | Deprecated: CheckDuplicate is now always enabled.  |  [optional] |
| **driver** | **kotlin.String** | Name of the network driver plugin to use. |  [optional] |
| **&#x60;internal&#x60;** | **kotlin.Boolean** | Restrict external access to the network. |  [optional] |
| **attachable** | **kotlin.Boolean** | Globally scoped network is manually attachable by regular containers from workers in swarm mode.  |  [optional] |
| **ingress** | **kotlin.Boolean** | Ingress network is the network which provides the routing-mesh in swarm mode.  |  [optional] |
| **IPAM** | [**IPAM**](IPAM.md) |  |  [optional] |
| **enableIPv6** | **kotlin.Boolean** | Enable IPv6 on the network. |  [optional] |
| **options** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | Network specific options to be used by the drivers. |  [optional] |
| **labels** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | User-defined key/value metadata. |  [optional] |



