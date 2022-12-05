
# BuildCache

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ID** | **kotlin.String** | Unique ID of the build cache record.  |  [optional]
**parent** | **kotlin.String** | ID of the parent build cache record.  &gt; **Deprecated**: This field is deprecated, and omitted if empty.  |  [optional]
**parents** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | List of parent build cache record IDs.  |  [optional]
**type** | [**inline**](#Type) | Cache record type.  |  [optional]
**description** | **kotlin.String** | Description of the build-step that produced the build cache.  |  [optional]
**inUse** | **kotlin.Boolean** | Indicates if the build cache is in use.  |  [optional]
**shared** | **kotlin.Boolean** | Indicates if the build cache is shared.  |  [optional]
**propertySize** | **kotlin.Int** | Amount of disk space used by the build cache (in bytes).  |  [optional]
**createdAt** | **kotlin.String** | Date and time at which the build cache was created in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  |  [optional]
**lastUsedAt** | **kotlin.String** | Date and time at which the build cache was last used in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  |  [optional]
**usageCount** | **kotlin.Int** |  |  [optional]


<a name="Type"></a>
## Enum: Type
Name | Value
---- | -----
type | internal, frontend, source.local, source.git.checkout, exec.cachemount, regular



