
# HostConfigAllOfLogConfig

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**inline**](#Type) | Name of the logging driver used for the container or \&quot;none\&quot; if logging is disabled. |  [optional] |
| **config** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | Driver-specific configuration options for the logging driver. |  [optional] |


<a id="Type"></a>
## Enum: Type
| Name | Value |
| ---- | ----- |
| type | local, json-file, syslog, journald, gelf, fluentd, awslogs, splunk, etwlogs, none |



