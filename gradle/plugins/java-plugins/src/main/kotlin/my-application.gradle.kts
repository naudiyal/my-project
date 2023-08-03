plugins{
    id("application") //this is Gradle's core application plugin
    id("my-java-base")
}

tasks.register<Zip>("bundle"){
    group = "My Group"
    description = "Package it all!!"
    //from("build/libs/app.jar") //possible but not preferred
    //following are preferred
    from(tasks.jar) //this will add JARs of all components
    from(configurations.runtimeClasspath)  //this will add JARs of all dependencies

    destinationDirectory.set(layout.buildDirectory.dir("distribution"))
}