
# NodeSpec

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | Name for the node. |  [optional] |
| **labels** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | User-defined key/value metadata. |  [optional] |
| **role** | [**inline**](#Role) | Role of the node. |  [optional] |
| **availability** | [**inline**](#Availability) | Availability of the node. |  [optional] |


<a id="Role"></a>
## Enum: Role
| Name | Value |
| ---- | ----- |
| role | worker, manager |


<a id="Availability"></a>
## Enum: Availability
| Name | Value |
| ---- | ----- |
| availability | active, pause, drain |



