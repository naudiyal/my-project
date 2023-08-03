plugins{
    id("application") //this is Gradle's core application plugin
    id("my-java-base")
}

tasks.register<JarCount>("countJars"){
    group = "My Group"
    description = "Counts!"

    allJars.from(tasks.jar)
    allJars.from(configurations.runtimeClasspath)

    countFile.set(layout.buildDirectory.file("gen/count.txt"))
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