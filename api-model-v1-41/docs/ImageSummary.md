
# ImageSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | ID is the content-addressable ID of an image.  This identifier is a content-addressable digest calculated from the image&#39;s configuration (which includes the digests of layers used by the image).  Note that this digest differs from the &#x60;RepoDigests&#x60; below, which holds digests of image manifests that reference the image.  | 
**parentId** | **kotlin.String** | ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry.  | 
**repoTags** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | List of image names/tags in the local image cache that reference this image.  Multiple image tags can refer to the same imagem and this list may be empty if no tags reference the image, in which case the image is \&quot;untagged\&quot;, in which case it can still be referenced by its ID.  | 
**repoDigests** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | List of content-addressable digests of locally available image manifests that the image is referenced from. Multiple manifests can refer to the same image.  These digests are usually only available if the image was either pulled from a registry, or if the image was pushed to a registry, which is when the manifest is generated and its digest calculated.  | 
**created** | **kotlin.Int** | Date and time at which the image was created as a Unix timestamp (number of seconds sinds EPOCH).  | 
**propertySize** | **kotlin.Long** | Total size of the image including all layers it is composed of.  | 
**sharedSize** | **kotlin.Long** | Total size of image layers that are shared between this image and other images.  This size is not calculated by default. &#x60;-1&#x60; indicates that the value has not been set / calculated.  | 
**virtualSize** | **kotlin.Long** | Total size of the image including all layers it is composed of.  In versions of Docker before v1.10, this field was calculated from the image itself and all of its parent images. Docker v1.10 and up store images self-contained, and no longer use a parent-chain, making this field an equivalent of the Size field.  This field is kept for backward compatibility, but may be removed in a future version of the API.  | 
**labels** | **kotlin.collections.MutableMap&lt;kotlin.String, kotlin.String&gt;** | User-defined key/value metadata. | 
**containers** | **kotlin.Int** | Number of containers using this image. Includes both stopped and running containers.  This size is not calculated by default, and depends on which API endpoint is used. &#x60;-1&#x60; indicates that the value has not been set / calculated.  | 



