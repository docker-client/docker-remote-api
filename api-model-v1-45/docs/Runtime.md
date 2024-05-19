
# Runtime

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **kotlin.String** | Name and, optional, path, of the OCI executable binary.  If the path is omitted, the daemon searches the host&#39;s &#x60;$PATH&#x60; for the binary and uses the first result.  |  [optional]
**runtimeArgs** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | List of command-line arguments to pass to the runtime when invoked.  |  [optional]
**status** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | Information specific to the runtime.  While this API specification does not define data provided by runtimes, the following well-known properties may be provided by runtimes:  &#x60;org.opencontainers.runtime-spec.features&#x60;: features structure as defined in the [OCI Runtime Specification](https://github.com/opencontainers/runtime-spec/blob/main/features.md), in a JSON string representation.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: The information returned in this field, including the &gt; formatting of values and labels, should not be considered stable, &gt; and may change without notice.  |  [optional]



