plugins{
    id("java")
    //because following is not a core Gradle plugin you need to add a dependency to build.gradle.kts
    //to tell Gradle to make the Jar that contains the plugin available at build time
    id("com.diffplug.spotless")
}

//following is an extention in Gradle because if you remove plugin id("java-library") above following will give error
java{
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}