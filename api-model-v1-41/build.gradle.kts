import java.text.SimpleDateFormat
import java.util.*

plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm")
  id("com.google.devtools.ksp")
  id("maven-publish")
  id("signing")
  id("com.github.ben-manes.versions")
  id("net.ossindex.audit")
  id("io.freefair.maven-central.validate-poms")
  id("org.openapi.generator")
  id("org.jlleitschuh.gradle.ktlint")
}

val remoteApiVersion = "1.41"

openApiGenerate {
  inputSpec.set(file("./docker-engine-api-v$remoteApiVersion.yaml").absolutePath)
  configFile.set(file("./openapi-generator-config.yaml").absolutePath)
  outputDir.set(file(".").absolutePath)
}
val openApiGenerateCleanupBuildScript by tasks.register("openApiGenerateCleanupBuildScript") {
  group = "openapi tools"
  dependsOn(tasks.openApiGenerate)
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
  dependsOn(tasks.openApiGenerate)
  doLast {
    listOf(
      "src/main/kotlin/de/gesellix/docker/remote/api/infrastructure",
      "src/main/kotlin/de/gesellix/docker/remote/client"
    ).onEach {
      file(it).deleteRecursively()
    }
  }
}
tasks.runKtlintFormatOverKotlinScripts.get().dependsOn(tasks.openApiGenerate, openApiGenerateCleanupBuildScript)
tasks.ktlintKotlinScriptFormat.get().dependsOn(tasks.openApiGenerate, openApiGenerateCleanupBuildScript)
tasks.ktlintMainSourceSetFormat.get().dependsOn(tasks.openApiGenerate, openApiGenerateCleanupBuildScript)
tasks.ktlintFormat.get().dependsOn(tasks.openApiGenerate, openApiGenerateCleanupBuildScript)
val updateApiModelSources by tasks.register("updateApiModelSources") {
  group = "openapi tools"
  dependsOn(tasks.ktlintFormat)
  finalizedBy(openApiGenerateCleanupGeneratedCode)
}

repositories {
  mavenCentral()
}

dependencies {
  constraints {
    listOf(
      "com.squareup.okio:okio",
      "com.squareup.okio:okio-jvm"
    ).forEach {
      implementation(it) {
        version {
          strictly("[3,4)")
          prefer("3.2.0")
        }
      }
    }
  }
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.7.10")

  implementation("com.squareup.moshi:moshi:1.14.0")
  ksp("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")

  testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.1")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
  testRuntimeOnly("cglib:cglib-nodep:3.3.0")
  testImplementation("org.junit.platform:junit-platform-launcher:1.9.1")
  testImplementation("org.junit.platform:junit-platform-commons:1.9.1")
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType(Test::class) {
  useJUnitPlatform()
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
