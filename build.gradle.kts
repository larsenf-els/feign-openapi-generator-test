plugins {
    id("org.openapi.generator") version "7.5.0"
    java
}

repositories {
    mavenCentral()
}

openApiGenerate {
    generatorName.set("java")
    inputSpec.set("$projectDir/src/main/resources/openapi.yaml")
    outputDir.set("${layout.buildDirectory}/generated")
    apiPackage.set("com.example.api")
    modelPackage.set("com.example.model")
    invokerPackage.set("com.example.invoker")
    configOptions.set(mapOf(
        "dateLibrary" to "java8",
        "library" to "feign"
    ))
}

dependencies {
    implementation("io.github.openfeign:feign-core:13.2.1")
    implementation("io.github.openfeign:feign-jackson:13.2.1")
}

tasks.named("compileJava") {
    dependsOn(tasks.named("openApiGenerate"))
}
