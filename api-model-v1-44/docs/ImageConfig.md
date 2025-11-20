
# ImageConfig

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **hostname** | **kotlin.String** | The hostname to use for the container, as a valid RFC 1123 hostname.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always empty and must not be used.  |  [optional] |
| **domainname** | **kotlin.String** | The domain name to use for the container.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always empty and must not be used.  |  [optional] |
| **user** | **kotlin.String** | The user that commands are run as inside the container. |  [optional] |
| **attachStdin** | **kotlin.Boolean** | Whether to attach to &#x60;stdin&#x60;.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always false and must not be used.  |  [optional] |
| **attachStdout** | **kotlin.Boolean** | Whether to attach to &#x60;stdout&#x60;.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always false and must not be used.  |  [optional] |
| **attachStderr** | **kotlin.Boolean** | Whether to attach to &#x60;stderr&#x60;.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always false and must not be used.  |  [optional] |
| **exposedPorts** | [**kotlin.collections.MutableMap&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | An object mapping ports to an empty object in the form:  &#x60;{\&quot;&lt;port&gt;/&lt;tcp|udp|sctp&gt;\&quot;: {}}&#x60;  |  [optional] |
| **tty** | **kotlin.Boolean** | Attach standard streams to a TTY, including &#x60;stdin&#x60; if it is not closed.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always false and must not be used.  |  [optional] |
| **openStdin** | **kotlin.Boolean** | Open &#x60;stdin&#x60;  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always false and must not be used.  |  [optional] |
| **stdinOnce** | **kotlin.Boolean** | Close &#x60;stdin&#x60; after one attached client disconnects.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always false and must not be used.  |  [optional] |
| **env** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | A list of environment variables to set inside the container in the form &#x60;[\&quot;VAR&#x3D;value\&quot;, ...]&#x60;. A variable without &#x60;&#x3D;&#x60; is removed from the environment, rather than to have an empty value.  |  [optional] |
| **cmd** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | Command to run specified as a string or an array of strings.  |  [optional] |
| **healthcheck** | [**HealthConfig**](HealthConfig.md) |  |  [optional] |
| **argsEscaped** | **kotlin.Boolean** | Command is already escaped (Windows only) |  [optional] |
| **image** | **kotlin.String** | The name (or reference) of the image to use when creating the container, or which was used when the container was created.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always empty and must not be used.  |  [optional] |
| **volumes** | [**kotlin.collections.MutableMap&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | An object mapping mount point paths inside the container to empty objects.  |  [optional] |
| **workingDir** | **kotlin.String** | The working directory for commands to run in. |  [optional] |
| **entrypoint** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | The entry point for the container as a string or an array of strings.  If the array consists of exactly one empty string (&#x60;[\&quot;\&quot;]&#x60;) then the entry point is reset to system default (i.e., the entry point used by docker when there is no &#x60;ENTRYPOINT&#x60; instruction in the &#x60;Dockerfile&#x60;).  |  [optional] |
| **networkDisabled** | **kotlin.Boolean** | Disable networking for the container.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always omitted and must not be used.  |  [optional] |
| **macAddress** | **kotlin.String** | MAC address of the container.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: this field is deprecated in API v1.44 and up. It is always omitted.  |  [optional] |
| **onBuild** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | &#x60;ONBUILD&#x60; metadata that were defined in the image&#39;s &#x60;Dockerfile&#x60;.  |  [optional] |
| **labels** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | User-defined key/value metadata. |  [optional] |
| **stopSignal** | **kotlin.String** | Signal to stop a container as a string or unsigned integer.  |  [optional] |
| **stopTimeout** | **kotlin.Int** | Timeout to stop a container in seconds.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: this field is always omitted and must not be used.  |  [optional] |
| **shell** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | Shell for when &#x60;RUN&#x60;, &#x60;CMD&#x60;, and &#x60;ENTRYPOINT&#x60; uses a shell.  |  [optional] |



