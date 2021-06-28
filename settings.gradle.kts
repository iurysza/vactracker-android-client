dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    google()
    mavenCentral()
    mavenLocal()
    jcenter() // Warning: this repository is going to shut down soon
  }
}
rootProject.name = "AndroidClient"
include(":app")
