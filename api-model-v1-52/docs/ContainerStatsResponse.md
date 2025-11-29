
# ContainerStatsResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | ID of the container for which the stats were collected.  |  [optional] |
| **name** | **kotlin.String** | Name of the container for which the stats were collected.  |  [optional] |
| **osType** | **kotlin.String** | OSType is the OS of the container (\&quot;linux\&quot; or \&quot;windows\&quot;) to allow platform-specific handling of stats.  |  [optional] |
| **read** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time at which this sample was collected. The value is formatted as [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) with nano-seconds.  |  [optional] |
| **cpuStats** | [**ContainerCPUStats**](ContainerCPUStats.md) |  |  [optional] |
| **memoryStats** | [**ContainerMemoryStats**](ContainerMemoryStats.md) |  |  [optional] |
| **networks** | [**kotlin.Any**](.md) | Network statistics for the container per interface.  This field is omitted if the container has no networking enabled.  |  [optional] |
| **pidsStats** | [**ContainerPidsStats**](ContainerPidsStats.md) |  |  [optional] |
| **blkioStats** | [**ContainerBlkioStats**](ContainerBlkioStats.md) |  |  [optional] |
| **numProcs** | **kotlin.Int** | The number of processors on the system.  This field is Windows-specific and always zero for Linux containers.  |  [optional] |
| **storageStats** | [**ContainerStorageStats**](ContainerStorageStats.md) |  |  [optional] |
| **preread** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Date and time at which this first sample was collected. This field is not propagated if the \&quot;one-shot\&quot; option is set. If the \&quot;one-shot\&quot; option is set, this field may be omitted, empty, or set to a default date (&#x60;0001-01-01T00:00:00Z&#x60;).  The value is formatted as [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) with nano-seconds.  |  [optional] |
| **precpuStats** | [**ContainerCPUStats**](ContainerCPUStats.md) |  |  [optional] |



