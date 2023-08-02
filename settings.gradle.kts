rootProject.name = "my-project"

pluginManagement{ //Gradle plugins
    repositories.gradlePluginPortal()
    //repositories.mavenCentral()
    //repositories.google()
    //repositories.maven("https://my.location/repo")
    //{
    //    credentials.username = ""
    //    credentials.password = ""
    //}
    includeBuild("gradle/plugins") //build components from source //my own Gradle plugins
}

dependencyResolutionManagement{
    repositories.mavenCentral()
    //repositories.google()
    //repositories.maven("https://my.location/repo")
    //{
    //    credentials.username = ""
    //    credentials.password = ""
    //}

    // includeBuild("../my-other-project") //build components from source
}

include("app")//app
include("business-logic")//business-logic
include("data-model")//data-model