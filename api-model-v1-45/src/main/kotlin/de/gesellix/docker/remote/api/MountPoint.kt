/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package de.gesellix.docker.remote.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * MountPoint represents a mount point configuration inside the container. This is used for reporting the mountpoints in use by a container.
 *
 * @param type The mount type:  - `bind` a mount of a file or directory from the host into the container. - `volume` a docker volume with the given `Name`. - `tmpfs` a `tmpfs`. - `npipe` a named pipe from the host into the container. - `cluster` a Swarm cluster volume
 * @param name Name is the name reference to the underlying data defined by `Source` e.g., the volume name.
 * @param source Source location of the mount.  For volumes, this contains the storage location of the volume (within `/var/lib/docker/volumes/`). For bind-mounts, and `npipe`, this contains the source (host) part of the bind-mount. For `tmpfs` mount points, this field is empty.
 * @param destination Destination is the path relative to the container root (`/`) where the `Source` is mounted inside the container.
 * @param driver Driver is the volume driver used to create the volume (if it is a volume).
 * @param mode Mode is a comma separated list of options supplied by the user when creating the bind/volume mount.  The default is platform-specific (`\"z\"` on Linux, empty on Windows).
 * @param RW Whether the mount is mounted writable (read-write).
 * @param propagation Propagation describes how mounts are propagated from the host into the mount point, and vice-versa. Refer to the [Linux kernel documentation](https://www.kernel.org/doc/Documentation/filesystems/sharedsubtree.txt) for details. This field is not used on Windows.
 */
@JsonClass(generateAdapter = true)
data class MountPoint(
    // The mount type:  - `bind` a mount of a file or directory from the host into the container. - `volume` a docker volume with the given `Name`. - `tmpfs` a `tmpfs`. - `npipe` a named pipe from the host into the container. - `cluster` a Swarm cluster volume
    @Json(name = "Type")
    var type: MountPoint.Type? = null,
    // Name is the name reference to the underlying data defined by `Source` e.g., the volume name.
    @Json(name = "Name")
    var name: kotlin.String? = null,
    // Source location of the mount.  For volumes, this contains the storage location of the volume (within `/var/lib/docker/volumes/`). For bind-mounts, and `npipe`, this contains the source (host) part of the bind-mount. For `tmpfs` mount points, this field is empty.
    @Json(name = "Source")
    var source: kotlin.String? = null,
    // Destination is the path relative to the container root (`/`) where the `Source` is mounted inside the container.
    @Json(name = "Destination")
    var destination: kotlin.String? = null,
    // Driver is the volume driver used to create the volume (if it is a volume).
    @Json(name = "Driver")
    var driver: kotlin.String? = null,
    // Mode is a comma separated list of options supplied by the user when creating the bind/volume mount.  The default is platform-specific (`\"z\"` on Linux, empty on Windows).
    @Json(name = "Mode")
    var mode: kotlin.String? = null,
    // Whether the mount is mounted writable (read-write).
    @Json(name = "RW")
    var RW: kotlin.Boolean? = null,
    // Propagation describes how mounts are propagated from the host into the mount point, and vice-versa. Refer to the [Linux kernel documentation](https://www.kernel.org/doc/Documentation/filesystems/sharedsubtree.txt) for details. This field is not used on Windows.
    @Json(name = "Propagation")
    var propagation: kotlin.String? = null,
) {
    /**
     * The mount type:  - `bind` a mount of a file or directory from the host into the container. - `volume` a docker volume with the given `Name`. - `tmpfs` a `tmpfs`. - `npipe` a named pipe from the host into the container. - `cluster` a Swarm cluster volume
     *
     * Values: Bind,Volume,Tmpfs,Npipe,Cluster
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "bind")
        Bind("bind"),

        @Json(name = "volume")
        Volume("volume"),

        @Json(name = "tmpfs")
        Tmpfs("tmpfs"),

        @Json(name = "npipe")
        Npipe("npipe"),

        @Json(name = "cluster")
        Cluster("cluster"),
    }
}