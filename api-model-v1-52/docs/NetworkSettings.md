
# NetworkSettings

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sandboxID** | **kotlin.String** | SandboxID uniquely represents a container&#39;s network stack. |  [optional] |
| **sandboxKey** | **kotlin.String** | SandboxKey is the full path of the netns handle |  [optional] |
| **ports** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.collections.MutableList&lt;PortBinding&gt;&gt;** | PortMap describes the mapping of container ports to host ports, using the container&#39;s port-number and protocol as key in the format &#x60;&lt;port&gt;/&lt;protocol&gt;&#x60;, for example, &#x60;80/udp&#x60;.  If a container&#39;s port is mapped for multiple protocols, separate entries are added to the mapping table.  |  [optional] |
| **networks** | [**kotlin.collections.MutableMap&lt;kotlin.String, EndpointSettings&gt;**](EndpointSettings.md) | Information about all networks that the container is connected to.  |  [optional] |



