
# MountTmpfsOptions

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sizeBytes** | **kotlin.Long** | The size for the tmpfs mount in bytes. |  [optional] |
| **mode** | **kotlin.Int** | The permission mode for the tmpfs mount in an integer. |  [optional] |
| **options** | **kotlin.collections.MutableList&lt;kotlin.collections.MutableList&lt;kotlin.String&gt;&gt;** | The options to be passed to the tmpfs mount. An array of arrays. Flag options should be provided as 1-length arrays. Other types should be provided as as 2-length arrays, where the first item is the key and the second the value.  |  [optional] |



