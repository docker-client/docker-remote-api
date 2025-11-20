
# ConfigSpec

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | User-defined name of the config. |  [optional] |
| **labels** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | User-defined key/value metadata. |  [optional] |
| **&#x60;data&#x60;** | **kotlin.String** | Data is the data to store as a config, formatted as a Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) string. The maximum allowed size is 1000KB, as defined in [MaxConfigSize](https://pkg.go.dev/github.com/moby/swarmkit/v2@v2.0.0-20250103191802-8c1959736554/manager/controlapi#MaxConfigSize).  |  [optional] |
| **templating** | [**Driver**](Driver.md) |  |  [optional] |



