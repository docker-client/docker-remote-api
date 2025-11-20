
# EndpointPortConfig

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** |  |  [optional] |
| **protocol** | [**inline**](#Protocol) |  |  [optional] |
| **targetPort** | **kotlin.Int** | The port inside the container. |  [optional] |
| **publishedPort** | **kotlin.Int** | The port on the swarm hosts. |  [optional] |
| **publishMode** | [**inline**](#PublishMode) | The mode in which port is published.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  - \&quot;ingress\&quot; makes the target port accessible on every node,   regardless of whether there is a task for the service running on   that node or not. - \&quot;host\&quot; bypasses the routing mesh and publish the port directly on   the swarm node where that service is running.  |  [optional] |


<a id="Protocol"></a>
## Enum: Protocol
| Name | Value |
| ---- | ----- |
| protocol | tcp, udp, sctp |


<a id="PublishMode"></a>
## Enum: PublishMode
| Name | Value |
| ---- | ----- |
| publishMode | ingress, host |



