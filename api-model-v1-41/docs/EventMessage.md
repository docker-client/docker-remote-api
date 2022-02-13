
# EventMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**inline**](#Type) | The type of object emitting the event |  [optional]
**action** | **kotlin.String** | The type of event |  [optional]
**actor** | [**EventActor**](EventActor.md) |  |  [optional]
**scope** | [**inline**](#Scope) | Scope of the event. Engine events are &#x60;local&#x60; scope. Cluster (Swarm) events are &#x60;swarm&#x60; scope.  |  [optional]
**time** | **kotlin.Long** | Timestamp of event |  [optional]
**timeNano** | **kotlin.Long** | Timestamp of event, with nanosecond accuracy |  [optional]


<a name="Type"></a>
## Enum: Type
Name | Value
---- | -----
type | builder, config, container, daemon, image, network, node, plugin, secret, service, volume


<a name="Scope"></a>
## Enum: scope
Name | Value
---- | -----
scope | local, swarm



