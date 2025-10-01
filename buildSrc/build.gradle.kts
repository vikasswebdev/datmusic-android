plugins {
    kotlin("jvm") version "1.7.10"
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

kotlin {
    jvmToolchain(17)
}
