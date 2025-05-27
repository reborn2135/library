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
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.flywaydb:flyway-mysql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
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


tasks.withType<Test> {
	useJUnitPlatform()
}
