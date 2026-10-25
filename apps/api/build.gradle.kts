plugins {
    id("platform.spring-boot-app")
}

dependencies {
    implementation(project(":libs:domain"))
    implementation(project(":platform:http-starter"))
    implementation(project(":platform:observability-starter"))
    implementation(project(":platform:resilience-starter"))

    testImplementation("org.springframework.boot:spring-boot-starter-webmvc-test")
}
