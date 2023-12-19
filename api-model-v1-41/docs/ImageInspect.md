
# ImageInspect

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | ID is the content-addressable ID of an image.  This identifier is a content-addressable digest calculated from the image&#39;s configuration (which includes the digests of layers used by the image).  Note that this digest differs from the &#x60;RepoDigests&#x60; below, which holds digests of image manifests that reference the image.  |  [optional]
**repoTags** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | List of image names/tags in the local image cache that reference this image.  Multiple image tags can refer to the same image, and this list may be empty if no tags reference the image, in which case the image is \&quot;untagged\&quot;, in which case it can still be referenced by its ID.  |  [optional]
**repoDigests** | **kotlin.collections.MutableList&lt;kotlin.String&gt;** | List of content-addressable digests of locally available image manifests that the image is referenced from. Multiple manifests can refer to the same image.  These digests are usually only available if the image was either pulled from a registry, or if the image was pushed to a registry, which is when the manifest is generated and its digest calculated.  |  [optional]
**parent** | **kotlin.String** | ID of the parent image.  Depending on how the image was created, this field may be empty and is only set for images that were built/created locally. This field is empty if the image was pulled from an image registry.  |  [optional]
**comment** | **kotlin.String** | Optional message that was set when committing or importing the image.  |  [optional]
**created** | **kotlin.String** | Date and time at which the image was created, formatted in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  |  [optional]
**container** | **kotlin.String** | The ID of the container that was used to create the image.  Depending on how the image was created, this field may be empty.  **Deprecated**: this field is kept for backward compatibility, but will be removed in API v1.45.  |  [optional]
**containerConfig** | [**ContainerConfig**](ContainerConfig.md) |  |  [optional]
**dockerVersion** | **kotlin.String** | The version of Docker that was used to build the image.  Depending on how the image was created, this field may be empty.  |  [optional]
**author** | **kotlin.String** | Name of the author that was specified when committing the image, or as specified through MAINTAINER (deprecated) in the Dockerfile.  |  [optional]
**config** | [**ContainerConfig**](ContainerConfig.md) |  |  [optional]
**architecture** | **kotlin.String** | Hardware CPU architecture that the image runs on.  |  [optional]
**variant** | **kotlin.String** | CPU architecture variant (presently ARM-only).  |  [optional]
**os** | **kotlin.String** | Operating System the image is built to run on.  |  [optional]
**osVersion** | **kotlin.String** | Operating System version the image is built to run on (especially for Windows).  |  [optional]
**propertySize** | **kotlin.Long** | Total size of the image including all layers it is composed of.  |  [optional]
**virtualSize** | **kotlin.Long** | Total size of the image including all layers it is composed of.  Deprecated: this field is omitted in API v1.44, but kept for backward compatibility. Use Size instead.  |  [optional]
**graphDriver** | [**GraphDriverData**](GraphDriverData.md) |  |  [optional]
**rootFS** | [**ImageInspectRootFS**](ImageInspectRootFS.md) |  |  [optional]
**metadata** | [**ImageInspectMetadata**](ImageInspectMetadata.md) |  |  [optional]



