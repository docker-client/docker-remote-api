
# PluginConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **kotlin.String** |  | 
**documentation** | **kotlin.String** |  | 
**&#x60;interface&#x60;** | [**PluginConfigInterface**](PluginConfigInterface.md) |  | 
**entrypoint** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** |  | 
**workDir** | **kotlin.String** |  | 
**network** | [**PluginConfigNetwork**](PluginConfigNetwork.md) |  | 
**linux** | [**PluginConfigLinux**](PluginConfigLinux.md) |  | 
**propagatedMount** | **kotlin.String** |  | 
**ipcHost** | **kotlin.Boolean** |  | 
**pidHost** | **kotlin.Boolean** |  | 
**mounts** | [**kotlin.collections.MutableList&lt;PluginMount&gt;**](PluginMount.md) |  | 
**env** | [**kotlin.collections.MutableList&lt;PluginEnv&gt;**](PluginEnv.md) |  | 
**args** | [**PluginConfigArgs**](PluginConfigArgs.md) |  | 
**dockerVersion** | **kotlin.String** | Docker Version used to create the plugin |  [optional]
**user** | [**PluginConfigUser**](PluginConfigUser.md) |  |  [optional]
**rootfs** | [**PluginConfigRootfs**](PluginConfigRootfs.md) |  |  [optional]



