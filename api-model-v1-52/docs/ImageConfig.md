
# ImageConfig

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | **kotlin.String** | The user that commands are run as inside the container. |  [optional] |
| **exposedPorts** | [**kotlin.collections.MutableMap&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | An object mapping ports to an empty object in the form:  &#x60;{\&quot;&lt;port&gt;/&lt;tcp|udp|sctp&gt;\&quot;: {}}&#x60;  |  [optional] |
| **env** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | A list of environment variables to set inside the container in the form &#x60;[\&quot;VAR&#x3D;value\&quot;, ...]&#x60;. A variable without &#x60;&#x3D;&#x60; is removed from the environment, rather than to have an empty value.  |  [optional] |
| **cmd** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | Command to run specified as a string or an array of strings.  |  [optional] |
| **healthcheck** | [**HealthConfig**](HealthConfig.md) |  |  [optional] |
| **argsEscaped** | **kotlin.Boolean** | Command is already escaped (Windows only) |  [optional] |
| **volumes** | [**kotlin.collections.MutableMap&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) | An object mapping mount point paths inside the container to empty objects.  |  [optional] |
| **workingDir** | **kotlin.String** | The working directory for commands to run in. |  [optional] |
| **entrypoint** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | The entry point for the container as a string or an array of strings.  If the array consists of exactly one empty string (&#x60;[\&quot;\&quot;]&#x60;) then the entry point is reset to system default (i.e., the entry point used by docker when there is no &#x60;ENTRYPOINT&#x60; instruction in the &#x60;Dockerfile&#x60;).  |  [optional] |
| **onBuild** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | &#x60;ONBUILD&#x60; metadata that were defined in the image&#39;s &#x60;Dockerfile&#x60;.  |  [optional] |
| **labels** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | User-defined key/value metadata. |  [optional] |
| **stopSignal** | **kotlin.String** | Signal to stop a container as a string or unsigned integer.  |  [optional] |
| **shell** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | Shell for when &#x60;RUN&#x60;, &#x60;CMD&#x60;, and &#x60;ENTRYPOINT&#x60; uses a shell.  |  [optional] |



