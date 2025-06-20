buildscript {
	repositories {
		mavenCentral()
	}
	dependencies {
		classpath("mysql:mysql-connector-java:8.0.33")
		classpath("org.flywaydb:flyway-mysql:10.15.0")
	}
}

plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.4.5"
	id("io.spring.dependency-management") version "1.1.7"
	id("org.flywaydb.flyway") version "10.15.0"
	id("org.springdoc.openapi-gradle-plugin") version "1.6.0" // openapi
}

group = "org.gomafu"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.flywaydb:flyway-mysql")
	implementation("de.huxhorn.sulky:de.huxhorn.sulky.ulid:8.3.0")
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.8") // UI表示用
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-api:2.8.8") // API仕様書出力用
	implementation("com.michael-bull.kotlin-result:kotlin-result:2.0.1")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testImplementation("org.junit.jupiter:junit-jupiter:5.12.2")
	testImplementation("org.junit.jupiter:junit-jupiter-params:5.12.2")
	testImplementation("org.junit.platform:junit-platform-suite:1.12.2")
	testImplementation("org.junit.platform:junit-platform-runner:1.12.2")
	testImplementation("io.mockk:mockk:1.14.2")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

flyway {
	url = "jdbc:mysql://localhost:3306/library?allowLoadLocalInfile=true"
	user = "develop"
	password = "password"
	cleanDisabled = false
	locations = arrayOf("filesystem:src/main/resources/db/migration")
	placeholders = mapOf(
		"dataPath" to "${projectDir}/src/main/resources/books.tsv"
	)
}

openApi {
	apiDocsUrl.set("http://localhost:8080/v3/api-docs.yaml")
	outputFileName.set("openapi.yaml")
}


tasks.withType<Test> {
	useJUnitPlatform()
}
