plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.31"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("com.github.kittinunf.fuel:fuel:2.3.1")

    testImplementation("io.kotest:kotest-runner-junit5:4.6.4")
    testImplementation("io.kotest:kotest-assertions-core:4.6.4")
    testImplementation("io.mockk:mockk:1.12.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

val sessionCookie: String? by project
application {
    mainClass.set("common/App")
    applicationDefaultJvmArgs = listOfNotNull(
        "-Dday=${System.getProperty("day")}",
        sessionCookie?.let { "-DsessionCookie=$it" }
    )
}

