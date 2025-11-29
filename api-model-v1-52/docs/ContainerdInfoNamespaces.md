
# ContainerdInfoNamespaces

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **containers** | **kotlin.String** | The default containerd namespace used for containers managed by the daemon.  The default namespace for containers is \&quot;moby\&quot;, but will be suffixed with the &#x60;&lt;uid&gt;.&lt;gid&gt;&#x60; of the remapped &#x60;root&#x60; if user-namespaces are enabled and the containerd image-store is used.  |  [optional] |
| **plugins** | **kotlin.String** | The default containerd namespace used for plugins managed by the daemon.  The default namespace for plugins is \&quot;plugins.moby\&quot;, but will be suffixed with the &#x60;&lt;uid&gt;.&lt;gid&gt;&#x60; of the remapped &#x60;root&#x60; if user-namespaces are enabled and the containerd image-store is used.  |  [optional] |



