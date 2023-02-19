rootProject.name = "docker-remote-api"
include("api-model-v1-41")

// https://docs.gradle.org/8.0.1/userguide/toolchains.html#sub:download_repositories
plugins {
  id("org.gradle.toolchains.foojay-resolver-convention") version("0.4.0")
}
