
# ImageManifestSummary

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **ID** | **kotlin.String** | ID is the content-addressable ID of an image and is the same as the digest of the image manifest.  |  |
| **descriptor** | [**OCIDescriptor**](OCIDescriptor.md) |  |  |
| **available** | **kotlin.Boolean** | Indicates whether all the child content (image config, layers) is fully available locally. |  |
| **propertySize** | [**ImageManifestSummarySize**](ImageManifestSummarySize.md) |  |  |
| **kind** | [**inline**](#Kind) | The kind of the manifest.  kind         | description -------------|----------------------------------------------------------- image        | Image manifest that can be used to start a container. attestation  | Attestation manifest produced by the Buildkit builder for a specific image manifest.  |  |
| **imageData** | [**ImageManifestSummaryImageData**](ImageManifestSummaryImageData.md) |  |  [optional] |
| **attestationData** | [**ImageManifestSummaryAttestationData**](ImageManifestSummaryAttestationData.md) |  |  [optional] |


<a id="Kind"></a>
## Enum: Kind
| Name | Value |
| ---- | ----- |
| kind | image, attestation, unknown |



