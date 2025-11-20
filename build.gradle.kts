import java.text.SimpleDateFormat
import java.util.*

rootProject.extra.set("artifactVersion", SimpleDateFormat("yyyy-MM-dd\'T\'HH-mm-ss").format(Date()))

plugins {
    id("maven-publish")
    id("com.github.ben-manes.versions") version "0.53.0"
    id("org.sonatype.gradle.plugins.scan") version "3.1.4"
    id("io.freefair.maven-central.validate-poms") version "9.1.0"
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
    alias(libs.plugins.kotlinJvm) apply false
    id("com.google.devtools.ksp") version "2.3.3" apply false
    id("org.openapi.generator") version "7.17.0" apply false
    id("org.jlleitschuh.gradle.ktlint") version "12.3.0" apply false
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

ossIndexAudit {
    username = System.getenv("SONATYPE_INDEX_USERNAME") ?: findProperty("sonatype.index.username")
    password = System.getenv("SONATYPE_INDEX_PASSWORD") ?: findProperty("sonatype.index.password")
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
                nexusUrl.set(uri("https://ossrh-staging-api.central.sonatype.com/service/local/"))
                snapshotRepositoryUrl.set(uri("https://central.sonatype.com/repository/maven-snapshots/"))
            }
        }
    }
}
