import java.text.SimpleDateFormat
import java.util.*

rootProject.extra.set("artifactVersion", SimpleDateFormat("yyyy-MM-dd\'T\'HH-mm-ss").format(Date()))

plugins {
    id("maven-publish")
    id("com.github.ben-manes.versions") version "0.52.0"
    id("net.ossindex.audit") version "0.4.11"
    id("io.freefair.maven-central.validate-poms") version "8.12.2"
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
    alias(libs.plugins.kotlinJvm) apply false
    id("com.google.devtools.ksp") version "2.1.10-1.0.29" apply false
    id("org.openapi.generator") version "7.11.0" apply false
    id("org.jlleitschuh.gradle.ktlint") version "12.1.2" apply false
}

val dependencyVersions = listOf(
    libs.kotlinReflect,
    libs.kotlinScriptRuntime,
    libs.kotlinStdlib,
    libs.kotlinCommon,
    libs.kotlinJdk7,
    libs.kotlinJdk8,
    libs.slf4j,
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
