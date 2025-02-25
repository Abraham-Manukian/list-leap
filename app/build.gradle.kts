plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kapt)
}

android {
    namespace = "com.example.list_leap"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.list_leap"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        compose = true
    }

    packagingOptions {
        resources.excludes += "/META-INF/{AL2.0,LGPL2.1}" //
    }
}

dependencies {
    // Основные библиотеки
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)

    // Jetpack Compose
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.material3)
    implementation(libs.androidx.navigation.compose)

    // Room (локальная база данных)
    implementation(libs.androidx.room.runtime)
    kapt(libs.androidx.room.compiler)

    // Networking (Retrofit + JSON)
    implementation(libs.retrofit.core)
    implementation(libs.retrofit.converter.gson)

    // Coroutines (асинхронная работа)
    implementation(libs.kotlinx.coroutines.android)

    // Dependency Injection (Hilt)
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    // Тестирование
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
}
