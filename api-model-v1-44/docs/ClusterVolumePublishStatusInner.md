
# ClusterVolumePublishStatusInner

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **nodeID** | **kotlin.String** | The ID of the Swarm node the volume is published on.  |  [optional] |
| **state** | [**inline**](#State) | The published state of the volume. * &#x60;pending-publish&#x60; The volume should be published to this node, but the call to the controller plugin to do so has not yet been successfully completed. * &#x60;published&#x60; The volume is published successfully to the node. * &#x60;pending-node-unpublish&#x60; The volume should be unpublished from the node, and the manager is awaiting confirmation from the worker that it has done so. * &#x60;pending-controller-unpublish&#x60; The volume is successfully unpublished from the node, but has not yet been successfully unpublished on the controller.  |  [optional] |
| **publishContext** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | A map of strings to strings returned by the CSI controller plugin when a volume is published.  |  [optional] |


<a id="State"></a>
## Enum: State
| Name | Value |
| ---- | ----- |
| state | pending-publish, published, pending-node-unpublish, pending-controller-unpublish |



