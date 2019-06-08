plugins {
    kotlin("jvm") version "1.3.31" apply true
    id("io.pilgrimdb.gradle.exposed") version "0.0.5"
}

buildscript {
    repositories {
        mavenLocal()
        maven(
            url = "https://plugins.gradle.org/m2/"
        )
    }
}

pilgrim {
    scanPackage = "io.pilgrimdb.sample.exposed"
    dbUrl = "jdbc:postgresql://localhost:5432/pilgrimdb"
    dbUser = "pilgrimdb"
    dbPassword = "pilgrimdb"
}

repositories {
    jcenter()
    maven(url = "https://dl.bintray.com/pilgrimdbio/pilgrimdb")
}

dependencies {
    api(kotlin("stdlib"))
    api("org.slf4j", "slf4j-api", "1.7.25")
    implementation("org.jetbrains.exposed:exposed:0.13.7")
    implementation("io.pilgrimdb:common:0.0.5")
}
