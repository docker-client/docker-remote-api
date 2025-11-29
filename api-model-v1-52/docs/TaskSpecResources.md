
# TaskSpecResources

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **limits** | [**Limit**](Limit.md) |  |  [optional] |
| **reservations** | [**ResourceObject**](ResourceObject.md) |  |  [optional] |
| **swapBytes** | **kotlin.Long** | Amount of swap in bytes - can only be used together with a memory limit. If not specified, the default behaviour is to grant a swap space twice as big as the memory limit. Set to -1 to enable unlimited swap.  |  [optional] |
| **memorySwappiness** | **kotlin.Long** | Tune the service&#39;s containers&#39; memory swappiness (0 to 100). If not specified, defaults to the containers&#39; OS&#39; default, generally 60, or whatever value was predefined in the image. Set to -1 to unset a previously set value.  |  [optional] |



