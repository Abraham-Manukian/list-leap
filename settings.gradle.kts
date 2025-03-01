pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "list-leap"
include(":app")
include(":core")
include(":core:ui-kit")
include(":core:utils")
include(":core:common")
include(":data")
include(":data:datastore")
include(":data:local")
include(":data:network")
include(":data:source")
include(":domain")
include(":feature")
include(":lint")
include(":build-logic")
include(":feature:auth")
include(":feature:home")
include(":feature:task")
include(":feature:reminder")
include(":feature:file")
include(":feature:settings")
