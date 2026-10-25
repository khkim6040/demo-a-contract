pluginManagement {
    includeBuild("build-logic")
}

rootProject.name = "demo-a-platform"

include(
    "libs:domain",
    "platform:http-starter",
    "platform:observability-starter",
    "platform:resilience-starter",
    "apps:api",
    "apps:admin",
    "apps:consumer",
    "apps:batch",
)
