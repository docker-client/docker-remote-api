import java.text.SimpleDateFormat
import java.util.*

rootProject.extra.set("artifactVersion", SimpleDateFormat("yyyy-MM-dd\'T\'HH-mm-ss").format(Date()))

plugins {
  id("maven-publish")
  id("com.github.ben-manes.versions") version "0.51.0"
  id("net.ossindex.audit") version "0.4.11"
  id("io.freefair.maven-central.validate-poms") version "8.10"
  id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
  id("org.jetbrains.kotlin.jvm") version "1.9.24" apply false
  id("com.google.devtools.ksp") version "1.9.24-1.0.20" apply false
  id("org.openapi.generator") version "7.8.0" apply false
  id("org.jlleitschuh.gradle.ktlint") version "12.1.1" apply false
}

val dependencyVersions = listOf(
  "org.jetbrains.kotlin:kotlin-reflect:1.9.25",
  "org.jetbrains.kotlin:kotlin-script-runtime:1.9.25",
  "org.jetbrains.kotlin:kotlin-stdlib:1.9.25",
  "org.jetbrains.kotlin:kotlin-stdlib-common:1.9.25",
  "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.9.25",
  "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.25",
  "org.slf4j:slf4j-api:2.0.16",
)

val dependencyGroupVersions = mapOf<String, String>(
//    "org.junit.jupiter" to "5.10.2",
//    "org.junit.platform" to "1.10.2",
)

subprojects {
  configurations.all {
    resolutionStrategy {
      failOnVersionConflict()
      force(dependencyVersions)
      eachDependency {
        val forcedVersion = dependencyGroupVersions[requested.group]
        if (forcedVersion != null) {
          useVersion(forcedVersion)
        }
      }
    }
  }
}

fun findProperty(s: String) = project.findProperty(s) as String?

val isSnapshot = project.version == "unspecified"
nexusPublishing {
  repositories {
    if (!isSnapshot) {
      sonatype {
        // 'sonatype' is pre-configured for Sonatype Nexus (OSSRH) which is used for The Central Repository
        stagingProfileId.set(System.getenv("SONATYPE_STAGING_PROFILE_ID") ?: findProperty("sonatype.staging.profile.id")) //can reduce execution time by even 10 seconds
        username.set(System.getenv("SONATYPE_USERNAME") ?: findProperty("sonatype.username"))
        password.set(System.getenv("SONATYPE_PASSWORD") ?: findProperty("sonatype.password"))
      }
    }
  }
}
