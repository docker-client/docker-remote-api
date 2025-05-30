import java.text.SimpleDateFormat
import java.util.*

plugins {
    id("java")
    alias(libs.plugins.kotlinJvm)
    id("com.google.devtools.ksp")
    id("maven-publish")
    id("signing")
    id("com.github.ben-manes.versions")
    id("net.ossindex.audit")
    id("io.freefair.maven-central.validate-poms")
    id("org.openapi.generator")
    id("org.jlleitschuh.gradle.ktlint")
}

val remoteApiVersion = "1.45"

logger.lifecycle("checking base: ${file(layout.buildDirectory.dir("generated")).path}")
configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    filter {
// see https://github.com/JLLeitschuh/ktlint-gradle/issues/579
        exclude("**/generated/**")
        exclude {
            it.file.path.startsWith(file(layout.buildDirectory.dir("generated")).path)
        }
        exclude("**/build.gradle.kts")
        exclude {
            it.file.path.endsWith("build.gradle.kts")
        }
    }
}

openApiGenerate {
    inputSpec.set(file("./docker-engine-api-v$remoteApiVersion.yaml").absolutePath)
    configFile.set(file("./openapi-generator-config.yaml").absolutePath)
    outputDir.set(file(".").absolutePath)
}
val openApiGenerateCleanupBuildScript by tasks.register("openApiGenerateCleanupBuildScript") {
    group = "openapi tools"
    mustRunAfter(tasks.openApiGenerate)
    doLast {
        listOf(
            "build.gradle",
            "gradlew",
            "gradlew.bat",
            "settings.gradle"
        ).onEach {
            file(it).delete()
        }
        listOf(
            "gradle"
        ).onEach {
            file(it).deleteRecursively()
        }
    }
}
val openApiGenerateCleanupGeneratedCode by tasks.register("openApiGenerateCleanupGeneratedCode") {
    group = "openapi tools"
    mustRunAfter(tasks.openApiGenerate)
    doLast {
        listOf(
            "src/main/kotlin/de/gesellix/docker/remote/api/infrastructure",
            "src/main/kotlin/de/gesellix/docker/remote/client",
            "src/test/kotlin/de/gesellix/docker/remote/api/infrastructure",
            "src/test/kotlin/de/gesellix/docker/remote/api",
            "src/test/kotlin/de/gesellix/docker/remote/client",
        ).onEach {
            file(it).deleteRecursively()
        }
    }
}

tasks.runKtlintFormatOverKotlinScripts.get().mustRunAfter(tasks.openApiGenerate, openApiGenerateCleanupBuildScript, openApiGenerateCleanupGeneratedCode)
tasks.ktlintKotlinScriptFormat.get().mustRunAfter(tasks.openApiGenerate, openApiGenerateCleanupBuildScript, openApiGenerateCleanupGeneratedCode)
tasks.ktlintMainSourceSetFormat.get().mustRunAfter(tasks.openApiGenerate, openApiGenerateCleanupBuildScript, openApiGenerateCleanupGeneratedCode)
tasks.loadKtlintReporters.get().mustRunAfter(tasks.openApiGenerate, openApiGenerateCleanupBuildScript, openApiGenerateCleanupGeneratedCode)
// tasks.ktlintFormat.get().dependsOn(
//  tasks.openApiGenerate,
//  openApiGenerateCleanupBuildScript,
//  openApiGenerateCleanupGeneratedCode,
//  tasks.named("ktlintGeneratedByKspKotlinSourceSetFormat")
// )
val updateApiModelSources by tasks.register("updateApiModelSources") {
    group = "openapi tools"
    dependsOn(
        tasks.openApiGenerate,
        openApiGenerateCleanupBuildScript
//    openApiGenerateCleanupGeneratedCode
    )

// TODO try to re-enable this one,
// so that a  single task can perform everything all at once.
//  finalizedBy(tasks.ktlintFormat)
}

// TODO find a better solution.
// This is a deprecated workaround,
// because the 'kspKotlin' task isn't present at
// evaluation time.
afterEvaluate {
    tasks.findByName("kspKotlin")?.mustRunAfter(tasks.openApiGenerate)
}

repositories {
    mavenCentral()
}

dependencies {
    constraints {
        listOf(libs.bundles.okio).forEach {
            implementation(it) {
                version {
                    strictly(libs.versions.okioVersionrange.get())
                    prefer(libs.versions.okio.get())
                }
            }
        }
    }
    implementation(libs.kotlinJdk8)

    implementation(libs.moshi)
    ksp("com.squareup.moshi:moshi-kotlin-codegen:${libs.versions.moshi.get()}")
    compileOnly(libs.okhttp)

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.13.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.13.0")
    testRuntimeOnly("cglib:cglib-nodep:3.3.0")
    testImplementation("org.junit.platform:junit-platform-launcher:1.13.0")
    testImplementation("org.junit.platform:junit-platform-commons:1.13.0")
//    testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}

java {
    toolchain {
        // The org.openapi.generator requires JDK 11 to generate the sources.
        // Generated code still works with Java 8.
        // See below where we use Java 8 to perform checks
        // See https://github.com/OpenAPITools/openapi-generator/pull/15553 for details.
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
    }
    withType<Test> {
        useJUnitPlatform()

        java {
            toolchain {
                // See above: the org.openapi.generator requires JDK 11 to generate the sources.
                // We're trying to ensure that the generated code still works with Java 8.
                languageVersion.set(JavaLanguageVersion.of(8))
            }
        }
    }
}

val javadocJar by tasks.registering(Jar::class) {
    dependsOn("classes")
    archiveClassifier.set("javadoc")
    from(tasks.javadoc)
}

val sourcesJar by tasks.registering(Jar::class) {
    dependsOn("classes")
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

artifacts {
    add("archives", sourcesJar.get())
    add("archives", javadocJar.get())
}

fun findProperty(s: String) = project.findProperty(s) as String?

val isSnapshot = project.version == "unspecified"
val artifactVersion = if (!isSnapshot) project.version as String else SimpleDateFormat("yyyy-MM-dd\'T\'HH-mm-ss").format(Date())!!
val publicationName = "dockerRemoteApiModel"
publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/${property("github.package-registry.owner")}/${property("github.package-registry.repository")}")
            credentials {
                username = System.getenv("GITHUB_ACTOR") ?: findProperty("github.package-registry.username")
                password = System.getenv("GITHUB_TOKEN") ?: findProperty("github.package-registry.password")
            }
        }
    }
    publications {
        register(publicationName, MavenPublication::class) {
            pom {
                name.set("docker-remote-api-model")
                description.set("API model for the Docker remote api v$remoteApiVersion")
                url.set("https://github.com/docker-client/docker-remote-api")
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }
                developers {
                    developer {
                        id.set("gesellix")
                        name.set("Tobias Gesellchen")
                        email.set("tobias@gesellix.de")
                    }
                }
                scm {
                    connection.set("scm:git:github.com/docker-client/docker-remote-api.git")
                    developerConnection.set("scm:git:ssh://github.com/docker-client/docker-remote-api.git")
                    url.set("https://github.com/docker-client/docker-remote-api")
                }
            }
            artifactId = "docker-remote-api-model-${remoteApiVersion.replace(Regex("\\."), "-")}"
            version = artifactVersion
            from(components["java"])
            artifact(sourcesJar.get())
            artifact(javadocJar.get())
        }
    }
}

signing {
    val signingKey: String? by project
    val signingPassword: String? by project
    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publishing.publications[publicationName])
}
