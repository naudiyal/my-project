plugins{
     `kotlin-dsl` // id("kotlin-dsl") //Only kotlin-dsl plugin is added like this
}

dependencies{
     //implementation("com.diffplug.spotless-plugin-gradle:6.8.0")
     implementation("com.diffplug.spotless:spotless-plugin-gradle:6.20.0")

     //To find out what coordinates you need for a certain plugin you can go to plugins.gradle.org
     //These external plugins can be upgraded without upgrading Gradle
}