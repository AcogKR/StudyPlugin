import kr.entree.spigradle.kotlin.spigot

plugins {
    kotlin("jvm") version "1.5.10"
    id("kr.entree.spigradle") version "2.3.2"
}

group = "cloud.acog"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(spigot("1.14.4"))
    implementation(kotlin("stdlib"))
}