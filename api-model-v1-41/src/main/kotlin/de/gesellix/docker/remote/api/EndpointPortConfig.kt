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
 *
 *
 * @param name
 * @param protocol
 * @param targetPort The port inside the container.
 * @param publishedPort The port on the swarm hosts.
 * @param publishMode The mode in which port is published.  <p><br /></p>  - \"ingress\" makes the target port accessible on every node,   regardless of whether there is a task for the service running on   that node or not. - \"host\" bypasses the routing mesh and publish the port directly on   the swarm node where that service is running.
 */
@JsonClass(generateAdapter = true)
data class EndpointPortConfig(
    @Json(name = "Name")
    var name: kotlin.String? = null,
    @Json(name = "Protocol")
    var protocol: EndpointPortConfig.Protocol? = null,
    // The port inside the container.
    @Json(name = "TargetPort")
    var targetPort: kotlin.Int? = null,
    // The port on the swarm hosts.
    @Json(name = "PublishedPort")
    var publishedPort: kotlin.Int? = null,
    // The mode in which port is published.  <p><br /></p>  - \"ingress\" makes the target port accessible on every node,   regardless of whether there is a task for the service running on   that node or not. - \"host\" bypasses the routing mesh and publish the port directly on   the swarm node where that service is running.
    @Json(name = "PublishMode")
    var publishMode: EndpointPortConfig.PublishMode? = PublishMode.Ingress,
) {
    /**
     *
     *
     * Values: Tcp,Udp,Sctp
     */
    @JsonClass(generateAdapter = false)
    enum class Protocol(val value: kotlin.String) {
        @Json(name = "tcp")
        Tcp("tcp"),

        @Json(name = "udp")
        Udp("udp"),

        @Json(name = "sctp")
        Sctp("sctp"),
    }

    /**
     * The mode in which port is published.  <p><br /></p>  - \"ingress\" makes the target port accessible on every node,   regardless of whether there is a task for the service running on   that node or not. - \"host\" bypasses the routing mesh and publish the port directly on   the swarm node where that service is running.
     *
     * Values: Ingress,Host
     */
    @JsonClass(generateAdapter = false)
    enum class PublishMode(val value: kotlin.String) {
        @Json(name = "ingress")
        Ingress("ingress"),

        @Json(name = "host")
        Host("host"),
    }
}
