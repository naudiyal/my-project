plugins{
    // java-library
    //id("java-library")
    id("my-java-library")
}

//following is an extention in Gradle because if you remove plugin id("java-library") above following will give error
//java{
//    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
//}

dependencies{
    //scope is implementation; local project
    implementation(project(":data-model"))

    //External component fetched from a repository
    // Better to not define version here but put them in a central place to avoid version conflicts
    //by defining different versions for the same component
    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation(project(mapOf("path" to ":data-model1")))
    implementation(project(mapOf("path" to ":data-model1")))
}