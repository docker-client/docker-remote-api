
# DeviceRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **driver** | **kotlin.String** | The name of the device driver to use for this request.  Note that if this is specified the capabilities are ignored when selecting a device driver.  |  [optional] |
| **count** | **kotlin.Int** |  |  [optional] |
| **deviceIDs** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** |  |  [optional] |
| **capabilities** | **kotlin.collections.MutableList&lt;kotlin.collections.MutableList&lt;kotlin.String&gt;&gt;** | A list of capabilities; an OR list of AND lists of capabilities.  Note that if a driver is specified the capabilities have no effect on selecting a driver as the driver name is used directly.  Note that if no driver is specified the capabilities are used to select a driver with the required capabilities.  |  [optional] |
| **options** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | Driver-specific options, specified as a key/value pairs. These options are passed directly to the driver.  |  [optional] |



