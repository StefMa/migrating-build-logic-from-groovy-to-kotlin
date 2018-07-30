buildscript {
    repositories {
        gradlePluginPortal()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:2.0.2.RELEASE")
    }
}

apply(plugin = "java")
apply(plugin = "org.springframework.boot")
apply<org.gradle.testing.jacoco.plugins.JacocoPlugin>()
