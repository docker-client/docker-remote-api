import java.text.SimpleDateFormat
import java.util.*

rootProject.extra.set("artifactVersion", SimpleDateFormat("yyyy-MM-dd\'T\'HH-mm-ss").format(Date()))

plugins {
  id("maven-publish")
  id("com.github.ben-manes.versions") version "0.42.0"
  id("net.ossindex.audit") version "0.4.11"
  id("io.freefair.maven-central.validate-poms") version "6.4.3"
  id("io.github.gradle-nexus.publish-plugin") version "1.1.0"
  id("org.jetbrains.kotlin.jvm") version "1.6.21" apply false
  id("com.google.devtools.ksp") version "1.6.21-1.0.5" apply false
  id("org.openapi.generator") version "5.4.0" apply false
  id("org.jlleitschuh.gradle.ktlint") version "10.3.0" apply false
}

val dependencyVersions = listOf(
  "org.jetbrains.kotlin:kotlin-reflect:1.6.21",
  "org.jetbrains.kotlin:kotlin-script-runtime:1.6.21",
  "org.jetbrains.kotlin:kotlin-stdlib:1.6.21",
  "org.jetbrains.kotlin:kotlin-stdlib-common:1.6.21",
  "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.6.21",
  "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.6.21"
)

val dependencyGroupVersions = mapOf<String, String>(
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
