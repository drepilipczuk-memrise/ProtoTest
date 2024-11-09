plugins {
    kotlin("plugin.serialization") version "2.0.21"
    kotlin("jvm")
}

group = "com.vehicle.domain"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.7.3")
    implementation(kotlin("stdlib-jdk8"))
}

kotlin {
    jvmToolchain(22)
}
