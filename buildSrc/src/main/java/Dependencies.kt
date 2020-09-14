package com.hb.jetgithub.buildsrc


object Versions {
    const val gradle = "4.2.0-alpha09"
    const val kotlin = "1.4.0"
    const val ktlint = "0.37.2"

    const val lifecycle = "2.2.0"
    const val okhttp3 = "4.5.0"
    const val stetho = "1.5.1"
    const val retrofit = "2.8.1"
    const val coroutine = "1.3.9"
    const val timber = "4.7.1"
    const val dagger = "2.29.1-alpha"
    const val daggerHilt = "1.0.0-alpha02"
    const val accompanist = "0.2.0"

}


object Libs {
    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:${Versions.kotlin}"
    }


    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.3.0-alpha01"
        const val coreKtx = "androidx.core:core-ktx:1.5.0-alpha02"

        object Compose {
            private const val version = "1.0.0-alpha01"

            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val foundation = "androidx.compose.foundation:foundation:${version}"
            const val layout = "androidx.compose.foundation:foundation-layout:${version}"
            const val ui = "androidx.compose.ui:ui:${version}"
            const val material = "androidx.compose.material:material:${version}"
            const val animation = "androidx.compose.animation:animation:${version}"
            const val tooling = "androidx.ui:ui-tooling:${version}"
            const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
        }
    }

    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.gradle}"
    const val material = "com.google.android.material:material:1.2.1"

    //Retrofit2
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    //Okhttp
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp3}"
    const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3}"

    //Stetho interceptor
    const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
    const val stethoOkhttp3 = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"

    //dagger Hilt
    const val daggerHiltClasspath = "com.google.dagger:hilt-android-gradle-plugin:${Versions.dagger}"
    const val daggerHiltAndroid = "com.google.dagger:hilt-android:${Versions.dagger}"
    const val daggerCommon = "androidx.hilt:hilt-common:${Versions.daggerHilt}"
    const val daggerViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.daggerHilt}"
    const val daggerCompiler = "com.google.dagger:hilt-compiler:${Versions.dagger}"
    const val daggerHiltCompiler = "androidx.hilt:hilt-compiler:${Versions.daggerHilt}"


    //lifecycle
    const val lifecycleExtension = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"

    //Coroutines
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val coil = "dev.chrisbanes.accompanist:accompanist-coil:${Versions.accompanist}"


    object Test {
        const val junit = "junit:junit:4.13"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
        private const val CoroutinesVersion = "1.3.9"
        const val coroutinesTest =
            "org.jetbrains.kotlinx:kotlinx-coroutines-test:$CoroutinesVersion"

        private const val version = "1.2.0"
        const val core = "androidx.test:core:$version"
        const val rules = "androidx.test:rules:$version"

        object Ext {
            private const val version = "1.1.2-rc01"
            const val junitExtension = "androidx.test.ext:junit-ktx:$version"
        }
    }
}