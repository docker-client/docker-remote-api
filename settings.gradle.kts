rootProject.name = "docker-remote-api"
include("api-model-v1-41")
include("api-model-v1-45")

// https://docs.gradle.org/current/userguide/toolchains.html#sub:download_repositories
plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
