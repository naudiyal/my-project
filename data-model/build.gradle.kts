
//In the older version of Gradle plugin block was not needed but is recommended now
//Plugin gives meaning to component or a sub project

//By dding following we tell Gradle that
//  -   We want this project to be Java library, has java code, can be built and will be used in another project
//When you add id("java-library") InteliJ displays folder com/example as com.example
plugins{
    id("my-java-library")

    //Following provides all Java core functionality like compiling and testing code
    //id("java")
    //java-library add more on top of that
    //id("java-library")

}

//Following is an extension in Gradle and can be added only if id("my-java-library") plugin is added; like above
//Configure Java version like following to mention which Java version to use for compiling and  testing code
//following is an extention in Gradle because if you remove plugin id("java-library") above following will give error
//java{
//    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
//}