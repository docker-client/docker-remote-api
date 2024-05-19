
# NetworkSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bridge** | **kotlin.String** | Name of the default bridge interface when dockerd&#39;s --bridge flag is set.  |  [optional]
**sandboxID** | **kotlin.String** | SandboxID uniquely represents a container&#39;s network stack. |  [optional]
**hairpinMode** | **kotlin.Boolean** | Indicates if hairpin NAT should be enabled on the virtual interface.  Deprecated: This field is never set and will be removed in a future release.  |  [optional]
**linkLocalIPv6Address** | **kotlin.String** | IPv6 unicast address using the link-local prefix.  Deprecated: This field is never set and will be removed in a future release.  |  [optional]
**linkLocalIPv6PrefixLen** | **kotlin.Int** | Prefix length of the IPv6 unicast address.  Deprecated: This field is never set and will be removed in a future release.  |  [optional]
**ports** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.collections.MutableList&lt;PortBinding&gt;&gt;** | PortMap describes the mapping of container ports to host ports, using the container&#39;s port-number and protocol as key in the format &#x60;&lt;port&gt;/&lt;protocol&gt;&#x60;, for example, &#x60;80/udp&#x60;.  If a container&#39;s port is mapped for multiple protocols, separate entries are added to the mapping table.  |  [optional]
**sandboxKey** | **kotlin.String** | SandboxKey is the full path of the netns handle |  [optional]
**secondaryIPAddresses** | [**kotlin.collections.MutableList&lt;Address&gt;**](Address.md) | Deprecated: This field is never set and will be removed in a future release. |  [optional]
**secondaryIPv6Addresses** | [**kotlin.collections.MutableList&lt;Address&gt;**](Address.md) | Deprecated: This field is never set and will be removed in a future release. |  [optional]
**endpointID** | **kotlin.String** | EndpointID uniquely represents a service endpoint in a Sandbox.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0  |  [optional]
**gateway** | **kotlin.String** | Gateway address for the default \&quot;bridge\&quot; network.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0  |  [optional]
**globalIPv6Address** | **kotlin.String** | Global IPv6 address for the default \&quot;bridge\&quot; network.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0  |  [optional]
**globalIPv6PrefixLen** | **kotlin.Int** | Mask length of the global IPv6 address.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0  |  [optional]
**ipAddress** | **kotlin.String** | IPv4 address for the default \&quot;bridge\&quot; network.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0  |  [optional]
**ipPrefixLen** | **kotlin.Int** | Mask length of the IPv4 address.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0  |  [optional]
**ipv6Gateway** | **kotlin.String** | IPv6 gateway address for this network.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0  |  [optional]
**macAddress** | **kotlin.String** | MAC address for the container on the default \&quot;bridge\&quot; network.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Deprecated**: This field is only propagated when attached to the &gt; default \&quot;bridge\&quot; network. Use the information from the \&quot;bridge\&quot; &gt; network inside the &#x60;Networks&#x60; map instead, which contains the same &gt; information. This field was deprecated in Docker 1.9 and is scheduled &gt; to be removed in Docker 17.12.0  |  [optional]
**networks** | [**kotlin.collections.MutableMap&lt;kotlin.String, EndpointSettings&gt;**](EndpointSettings.md) | Information about all networks that the container is connected to.  |  [optional]


