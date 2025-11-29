
# SecretCreateRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** | User-defined name of the secret. |  [optional] |
| **labels** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | User-defined key/value metadata. |  [optional] |
| **&#x60;data&#x60;** | **kotlin.String** | Data is the data to store as a secret, formatted as a Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) string. It must be empty if the Driver field is set, in which case the data is loaded from an external secret store. The maximum allowed size is 500KB, as defined in [MaxSecretSize](https://pkg.go.dev/github.com/moby/swarmkit/v2@v2.0.0/api/validation#MaxSecretSize).  This field is only used to _create_ a secret, and is not returned by other endpoints.  |  [optional] |
| **driver** | [**Driver**](Driver.md) |  |  [optional] |
| **templating** | [**Driver**](Driver.md) |  |  [optional] |



