plugins {
    kotlin("jvm") version "1.9.22"
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

kotlin {
    jvmToolchain(17)
}
