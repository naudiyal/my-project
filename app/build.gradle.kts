plugins{
    //java-library
    //id("java-library") //applies id("java")
    id("my-application")
}

//following is an extention in Gradle because if you remove plugin id("java-library") above following will give error
//java{
//    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
//}

application{
    mainClass.set("com.example.MyApplication")
}

dependencies{
    //scope is implementation; local project
    implementation(project(":data-model"))
    implementation(project(":business-logic"))
}