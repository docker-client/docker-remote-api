
# ContainerMemoryStats

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **usage** | **kotlin.Int** | Current &#x60;res_counter&#x60; usage for memory.  This field is Linux-specific and omitted for Windows containers.  |  [optional] |
| **maxUsage** | **kotlin.Int** | Maximum usage ever recorded.  This field is Linux-specific and only supported on cgroups v1. It is omitted when using cgroups v2 and for Windows containers.  |  [optional] |
| **stats** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.Int&gt;** | All the stats exported via memory.stat. when using cgroups v2.  This field is Linux-specific and omitted for Windows containers.  |  [optional] |
| **failcnt** | **kotlin.Int** | Number of times memory usage hits limits.  This field is Linux-specific and only supported on cgroups v1. It is omitted when using cgroups v2 and for Windows containers.  |  [optional] |
| **limit** | **kotlin.Int** | This field is Linux-specific and omitted for Windows containers.  |  [optional] |
| **commitbytes** | **kotlin.Int** | Committed bytes.  This field is Windows-specific and omitted for Linux containers.  |  [optional] |
| **commitpeakbytes** | **kotlin.Int** | Peak committed bytes.  This field is Windows-specific and omitted for Linux containers.  |  [optional] |
| **privateworkingset** | **kotlin.Int** | Private working set.  This field is Windows-specific and omitted for Linux containers.  |  [optional] |



