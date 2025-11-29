
# ContainerNetworkStats

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **rxBytes** | **kotlin.Int** | Bytes received. Windows and Linux.  |  [optional] |
| **rxPackets** | **kotlin.Int** | Packets received. Windows and Linux.  |  [optional] |
| **rxErrors** | **kotlin.Int** | Received errors. Not used on Windows.  This field is Linux-specific and always zero for Windows containers.  |  [optional] |
| **rxDropped** | **kotlin.Int** | Incoming packets dropped. Windows and Linux.  |  [optional] |
| **txBytes** | **kotlin.Int** | Bytes sent. Windows and Linux.  |  [optional] |
| **txPackets** | **kotlin.Int** | Packets sent. Windows and Linux.  |  [optional] |
| **txErrors** | **kotlin.Int** | Sent errors. Not used on Windows.  This field is Linux-specific and always zero for Windows containers.  |  [optional] |
| **txDropped** | **kotlin.Int** | Outgoing packets dropped. Windows and Linux.  |  [optional] |
| **endpointId** | **kotlin.String** | Endpoint ID. Not used on Linux.  This field is Windows-specific and omitted for Linux containers.  |  [optional] |
| **instanceId** | **kotlin.String** | Instance ID. Not used on Linux.  This field is Windows-specific and omitted for Linux containers.  |  [optional] |



