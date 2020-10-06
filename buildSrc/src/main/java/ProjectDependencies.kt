package com.hb.jetgithub.buildsrc

object ProjectDependencies {
    const val daggerHiltClasspath =
        "com.google.dagger:hilt-android-gradle-plugin:${Versions.dagger}"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.gradle}"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"

}