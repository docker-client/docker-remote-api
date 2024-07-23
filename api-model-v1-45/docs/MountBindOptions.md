
# MountBindOptions

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **propagation** | [**inline**](#Propagation) | A propagation mode with the value &#x60;[r]private&#x60;, &#x60;[r]shared&#x60;, or &#x60;[r]slave&#x60;. |  [optional] |
| **nonRecursive** | **kotlin.Boolean** | Disable recursive bind mount. |  [optional] |
| **createMountpoint** | **kotlin.Boolean** | Create mount point on host if missing |  [optional] |
| **readOnlyNonRecursive** | **kotlin.Boolean** | Make the mount non-recursively read-only, but still leave the mount recursive (unless NonRecursive is set to &#x60;true&#x60; in conjunction).  Addded in v1.44, before that version all read-only mounts were non-recursive by default. To match the previous behaviour this will default to &#x60;true&#x60; for clients on versions prior to v1.44.  |  [optional] |
| **readOnlyForceRecursive** | **kotlin.Boolean** | Raise an error if the mount cannot be made recursively read-only. |  [optional] |


<a id="Propagation"></a>
## Enum: Propagation
| Name | Value |
| ---- | ----- |
| propagation | private, rprivate, shared, rshared, slave, rslave |



