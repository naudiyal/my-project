plugins{
    //java-library
    //id("java-library") //applies id("java")
    id("my-java-library")
}

//following is an extention in Gradle because if you remove plugin id("java-library") above following will give error
//java{
//    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
//}