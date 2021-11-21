/**
* Docker Engine API
* The Engine API is an HTTP API served by Docker Engine. It is the API the Docker client uses to communicate with the Engine, so everything the Docker client can do can be done with the API.  Most of the client's commands map directly to API endpoints (e.g. `docker ps` is `GET /containers/json`). The notable exception is running containers, which consists of several API calls.  # Errors  The API uses standard HTTP status codes to indicate the success or failure of the API call. The body of the response will be JSON in the following format:  ``` {   \"message\": \"page not found\" } ```  # Versioning  The API is usually changed in each release, so API calls are versioned to ensure that clients don't break. To lock to a specific version of the API, you prefix the URL with its version, for example, call `/v1.30/info` to use the v1.30 version of the `/info` endpoint. If the API version specified in the URL is not supported by the daemon, a HTTP `400 Bad Request` error message is returned.  If you omit the version-prefix, the current version of the API (v1.41) is used. For example, calling `/info` is the same as calling `/v1.41/info`. Using the API without a version-prefix is deprecated and will be removed in a future release.  Engine releases in the near future should support this version of the API, so your client will continue to work even if it is talking to a newer Engine.  The API uses an open schema model, which means server may add extra properties to responses. Likewise, the server will ignore any extra query parameters and request body properties. When you write clients, you need to ignore additional properties in responses to ensure they do not break when talking to newer daemons.   # Authentication  Authentication for registries is handled client side. The client has to send authentication details to various endpoints that need to communicate with registries, such as `POST /images/(name)/push`. These are sent as `X-Registry-Auth` header as a [base64url encoded](https://tools.ietf.org/html/rfc4648#section-5) (JSON) string with the following structure:  ``` {   \"username\": \"string\",   \"password\": \"string\",   \"email\": \"string\",   \"serveraddress\": \"string\" } ```  The `serveraddress` is a domain/IP without a protocol. Throughout this structure, double quotes are required.  If you have already got an identity token from the [`/auth` endpoint](#operation/SystemAuth), you can just pass this instead of credentials:  ``` {   \"identitytoken\": \"9cbaf023786cd7...\" } ``` 
*
* The version of the OpenAPI document: 1.41
*
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package de.gesellix.docker.remote.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Specification for the update strategy of the service.
 * @param parallelism Maximum number of tasks to be updated in one iteration (0 means unlimited parallelism).
 * @param delay Amount of time between updates, in nanoseconds.
 * @param failureAction Action to take if an updated task fails to run, or stops running during the update.
 * @param monitor Amount of time to monitor each updated task for failures, in nanoseconds.
 * @param maxFailureRatio The fraction of tasks that may fail during an update before the failure action is invoked, specified as a floating point number between 0 and 1.
 * @param order The order of operations when rolling out an updated task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down.
 */
@JsonClass(generateAdapter = true)
data class ServiceSpecUpdateConfig(
  /* Maximum number of tasks to be updated in one iteration (0 means unlimited parallelism).  */
  @Json(name = "Parallelism")
  var parallelism: kotlin.Long? = null,
  /* Amount of time between updates, in nanoseconds. */
  @Json(name = "Delay")
  var delay: kotlin.Long? = null,
  /* Action to take if an updated task fails to run, or stops running during the update.  */
  @Json(name = "FailureAction")
  var failureAction: ServiceSpecUpdateConfig.FailureAction? = null,
  /* Amount of time to monitor each updated task for failures, in nanoseconds.  */
  @Json(name = "Monitor")
  var monitor: kotlin.Long? = null,
  /* The fraction of tasks that may fail during an update before the failure action is invoked, specified as a floating point number between 0 and 1.  */
  @Json(name = "MaxFailureRatio")
  var maxFailureRatio: java.math.BigDecimal? = null,
  /* The order of operations when rolling out an updated task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down.  */
  @Json(name = "Order")
  var order: ServiceSpecUpdateConfig.Order? = null
) {

  /**
   * Action to take if an updated task fails to run, or stops running during the update.
   * Values: Continue,Pause,Rollback
   */
  enum class FailureAction(val value: kotlin.String) {
    @Json(name = "continue") Continue("continue"),
    @Json(name = "pause") Pause("pause"),
    @Json(name = "rollback") Rollback("rollback");
  }
  /**
   * The order of operations when rolling out an updated task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down.
   * Values: StopMinusFirst,StartMinusFirst
   */
  enum class Order(val value: kotlin.String) {
    @Json(name = "stop-first") StopMinusFirst("stop-first"),
    @Json(name = "start-first") StartMinusFirst("start-first");
  }
}
