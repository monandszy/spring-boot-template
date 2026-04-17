plugins {
  application
  alias(libs.plugins.spring.boot)
  alias(libs.plugins.spring.management)
  alias(libs.plugins.javaagent)
  id("com.unclezs.gradle.sass") version "1.0.10"
}

group = "code"
java.toolchain.languageVersion = JavaLanguageVersion.of(21)

repositories {
  mavenCentral()
  maven { url = uri("https://repo.spring.io/release") }
  maven { url = uri("https://repo.spring.io/milestone") }
}

version = "latest"

dependencies {
  implementation(libs.spring.modulith)

  implementation(libs.bundles.spring.data)
  runtimeOnly(libs.postgresql)

  implementation(libs.bundles.observability)
  runtimeOnly(libs.modulith.observability)

  implementation(libs.bundles.events)

  implementation(libs.bundles.spring.web)
  implementation(libs.bundles.thymeleaf)

//  implementation(libs.bundles.jmolecules)
  compileOnly(libs.lombok)
  annotationProcessor(libs.lombok)
  testImplementation(libs.lombok)
  testAnnotationProcessor(libs.lombok)
  implementation(libs.mapstruct)
  annotationProcessor(libs.bundles.mapstruct.annotation)

  testImplementation(libs.bundles.testcontainers)
  testImplementation(libs.junit.jupiter)
  testRuntimeOnly(libs.junit.platform)
  testImplementation(libs.bundles.spring.test)

  developmentOnly(libs.spring.dev.tools)
  testJavaagent(libs.javaagent.impl)

  implementation("com.google.code.findbugs:jsr305:3.0.2")
//  implementation("org.openapitools:openapi-java-client:v1beta")
  implementation("io.swagger.core.v3:swagger-annotations:2.2.25")
  implementation("org.openapitools:jackson-databind-nullable:0.2.6")
  implementation("javax.annotation:javax.annotation-api:1.3.2")
  implementation("org.springframework.boot:spring-boot-starter-webflux")
  implementation("org.slf4j:slf4j-api:2.0.5")
  implementation("com.github.tomakehurst:wiremock-standalone:2.27.2")
//  implementation("org.wiremock:wiremock-standalone:3.9.2") // use once cause of 500 errors is found
//  testImplementation ("io.rest-assured:rest-assured:${restAssured}")
}

dependencyManagement {
  imports {
    mavenBom("org.springframework.modulith:spring-modulith-bom:1.2.1")
//    mavenBom("org.jmolecules:jmolecules-bom:2023.1.4")
    mavenBom("io.opentelemetry.instrumentation:opentelemetry-instrumentation-bom:2.6.0")
  }
}

sass {
  cssPath = "static/css"
  sassPath = "static/scss"
  // --rerun-tasks
}

tasks {
  compileSass {
    outputs.upToDateWhen { false }
  }
  compileJava {
    dependsOn(compileSass)
    options.encoding = "UTF-8"
  }
  compileTestJava {
    options.encoding = "UTF-8"
  }
  bootJar {
    archiveFileName = "${project.name}-${version}.${archiveExtension.get()}"
  }
  jar {
    enabled = false
  }

  test {
    useJUnitPlatform()
    testLogging {
      events("passed", "skipped", "failed")
    }
  }


  javadoc {
    setDestinationDir(file(layout.buildDirectory.dir("reports/javadoc")))
    options.encoding = "UTF-8"
  }
}