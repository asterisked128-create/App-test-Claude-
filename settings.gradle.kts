pluginManagement {
    repositories {
        google()
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

rootProject.name = "Aurora"

include(":app")
include(":core:common")
include(":core:model")
include(":core:database")
include(":core:network")
include(":core:designsystem")
include(":core:navigation")
include(":core:ui")
include(":feature:home")
include(":feature:anime")
include(":feature:manga")
include(":feature:novel")
