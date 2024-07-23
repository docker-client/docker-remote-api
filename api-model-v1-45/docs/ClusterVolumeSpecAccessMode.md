
# ClusterVolumeSpecAccessMode

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **scope** | [**inline**](#Scope) | The set of nodes this volume can be used on at one time. - &#x60;single&#x60; The volume may only be scheduled to one node at a time. - &#x60;multi&#x60; the volume may be scheduled to any supported number of nodes at a time.  |  [optional] |
| **sharing** | [**inline**](#Sharing) | The number and way that different tasks can use this volume at one time. - &#x60;none&#x60; The volume may only be used by one task at a time. - &#x60;readonly&#x60; The volume may be used by any number of tasks, but they all must mount the volume as readonly - &#x60;onewriter&#x60; The volume may be used by any number of tasks, but only one may mount it as read/write. - &#x60;all&#x60; The volume may have any number of readers and writers.  |  [optional] |
| **mountVolume** | [**kotlin.Any**](.md) | Options for using this volume as a Mount-type volume.      Either MountVolume or BlockVolume, but not both, must be     present.   properties:     FsType:       type: \&quot;string\&quot;       description: |         Specifies the filesystem type for the mount volume.         Optional.     MountFlags:       type: \&quot;array\&quot;       description: |         Flags to pass when mounting the volume. Optional.       items:         type: \&quot;string\&quot; BlockVolume:   type: \&quot;object\&quot;   description: |     Options for using this volume as a Block-type volume.     Intentionally empty.  |  [optional] |
| **secrets** | [**kotlin.collections.MutableList&lt;ClusterVolumeSpecAccessModeSecretsInner&gt;**](ClusterVolumeSpecAccessModeSecretsInner.md) | Swarm Secrets that are passed to the CSI storage plugin when operating on this volume.  |  [optional] |
| **accessibilityRequirements** | [**ClusterVolumeSpecAccessModeAccessibilityRequirements**](ClusterVolumeSpecAccessModeAccessibilityRequirements.md) |  |  [optional] |
| **capacityRange** | [**ClusterVolumeSpecAccessModeCapacityRange**](ClusterVolumeSpecAccessModeCapacityRange.md) |  |  [optional] |
| **availability** | [**inline**](#Availability) | The availability of the volume for use in tasks. - &#x60;active&#x60; The volume is fully available for scheduling on the cluster - &#x60;pause&#x60; No new workloads should use the volume, but existing workloads are not stopped. - &#x60;drain&#x60; All workloads using this volume should be stopped and rescheduled, and no new ones should be started.  |  [optional] |


<a id="Scope"></a>
## Enum: Scope
| Name | Value |
| ---- | ----- |
| scope | single, multi |


<a id="Sharing"></a>
## Enum: Sharing
| Name | Value |
| ---- | ----- |
| sharing | none, readonly, onewriter, all |


<a id="Availability"></a>
## Enum: Availability
| Name | Value |
| ---- | ----- |
| availability | active, pause, drain |



