//following is build name, if not set build gets the name of the folder
rootProject.name = "my-project"

//Components in repository are binary components i.e. already built

//Following is how to inlcude plugins; Plugins extens Gradle itself
pluginManagement{ //Gradle plugins
    //Gradle is extensible with Gradle plugins; Following extend Gradle itself
    repositories.gradlePluginPortal()
    //repositories.mavenCentral()
    //repositories.google()
    //repositories.maven("https://my.location/repo")
    //{
    //    credentials.username = ""
    //    credentials.password = ""
    //}

    //Build components from source if required
    //In large projects this helps in splitting one software project into multiple builds
    //Input parameter is to find where to find other project builds you want to include
    includeBuild("gradle/plugins") //build components from source //my own Gradle plugins
}

dependencyResolutionManagement{
    repositories.mavenCentral()

    //Following is google specific one which provides android libraries
    //repositories.google()

    //following is example of my own repository
    //repositories.maven("https://my.location/repo")
    //{
    //    credentials.username = ""
    //    credentials.password = ""
    //}

    // includeBuild("../my-other-project") //build components from source
}

//Following are sub projects
include("app")//app
include("business-logic")//business-logic
include("data-model")//data-model