
# ContainerInspectResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** | The ID of this container as a 128-bit (64-character) hexadecimal string (32 bytes). |  [optional] |
| **created** | **kotlin.String** | Date and time at which the container was created, formatted in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. |  [optional] |
| **path** | **kotlin.String** | The path to the command being run |  [optional] |
| **args** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | The arguments to the command being run |  [optional] |
| **state** | [**ContainerState**](ContainerState.md) |  |  [optional] |
| **image** | **kotlin.String** | The ID (digest) of the image that this container was created from. |  [optional] |
| **resolvConfPath** | **kotlin.String** | Location of the &#x60;/etc/resolv.conf&#x60; generated for the container on the host.  This file is managed through the docker daemon, and should not be accessed or modified by other tools. |  [optional] |
| **hostnamePath** | **kotlin.String** | Location of the &#x60;/etc/hostname&#x60; generated for the container on the host.  This file is managed through the docker daemon, and should not be accessed or modified by other tools. |  [optional] |
| **hostsPath** | **kotlin.String** | Location of the &#x60;/etc/hosts&#x60; generated for the container on the host.  This file is managed through the docker daemon, and should not be accessed or modified by other tools. |  [optional] |
| **logPath** | **kotlin.String** | Location of the file used to buffer the container&#39;s logs. Depending on the logging-driver used for the container, this field may be omitted.  This file is managed through the docker daemon, and should not be accessed or modified by other tools. |  [optional] |
| **name** | **kotlin.String** | The name associated with this container.  For historic reasons, the name may be prefixed with a forward-slash (&#x60;/&#x60;). |  [optional] |
| **restartCount** | **kotlin.Int** | Number of times the container was restarted since it was created, or since daemon was started. |  [optional] |
| **driver** | **kotlin.String** | The storage-driver used for the container&#39;s filesystem (graph-driver or snapshotter). |  [optional] |
| **platform** | **kotlin.String** | The platform (operating system) for which the container was created.  This field was introduced for the experimental \&quot;LCOW\&quot; (Linux Containers On Windows) features, which has been removed. In most cases, this field is equal to the host&#39;s operating system (&#x60;linux&#x60; or &#x60;windows&#x60;). |  [optional] |
| **imageManifestDescriptor** | [**OCIDescriptor**](OCIDescriptor.md) |  |  [optional] |
| **mountLabel** | **kotlin.String** | SELinux mount label set for the container. |  [optional] |
| **processLabel** | **kotlin.String** | SELinux process label set for the container. |  [optional] |
| **appArmorProfile** | **kotlin.String** | The AppArmor profile set for the container. |  [optional] |
| **execIDs** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | IDs of exec instances that are running in the container. |  [optional] |
| **hostConfig** | [**HostConfig**](HostConfig.md) |  |  [optional] |
| **graphDriver** | [**DriverData**](DriverData.md) |  |  [optional] |
| **storage** | [**Storage**](Storage.md) |  |  [optional] |
| **sizeRw** | **kotlin.Long** | The size of files that have been created or changed by this container.  This field is omitted by default, and only set when size is requested in the API request. |  [optional] |
| **sizeRootFs** | **kotlin.Long** | The total size of all files in the read-only layers from the image that the container uses. These layers can be shared between containers.  This field is omitted by default, and only set when size is requested in the API request. |  [optional] |
| **mounts** | [**kotlin.collections.MutableList&lt;MountPoint&gt;**](MountPoint.md) | List of mounts used by the container. |  [optional] |
| **config** | [**ContainerConfig**](ContainerConfig.md) |  |  [optional] |
| **networkSettings** | [**NetworkSettings**](NetworkSettings.md) |  |  [optional] |



