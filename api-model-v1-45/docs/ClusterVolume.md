
# ClusterVolume

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **kotlin.String** | The Swarm ID of this volume. Because cluster volumes are Swarm objects, they have an ID, unlike non-cluster volumes. This ID can be used to refer to the Volume instead of the name.  |  [optional]
**version** | [**ObjectVersion**](ObjectVersion.md) |  |  [optional]
**createdAt** | **kotlin.String** |  |  [optional]
**updatedAt** | **kotlin.String** |  |  [optional]
**spec** | [**ClusterVolumeSpec**](ClusterVolumeSpec.md) |  |  [optional]
**info** | [**ClusterVolumeInfo**](ClusterVolumeInfo.md) |  |  [optional]
**publishStatus** | [**kotlin.collections.MutableList&lt;ClusterVolumePublishStatusInner&gt;**](ClusterVolumePublishStatusInner.md) | The status of the volume as it pertains to its publishing and use on specific nodes  |  [optional]



