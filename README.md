# Testing OpenAPI Generator for generating Java Feign client 

This project is used for testing the OpenAPI Generator (version 7.5.0) regarding generating a Java Feign client.

The project is build using Gradle:
```shell
./gradlew build
```
And it generates and output files to the [./build/generated/]() directory.

The file of interest is the generated [DefaultApi.java](./build/generated/src/main/java/org/openapitools/client/api/DefaultApi.java) file.
