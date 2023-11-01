plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("com.google.dagger.hilt.android")
    id("com.google.android.libraries.mapsplatform.secrets-gradle-plugin")
}

android {
    namespace = "com.rhappdeveloper.newsapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.rhappdeveloper.newsapp"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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
        buildConfig = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleRuntimeKtx)
    implementation(Dependencies.activityCompose)
    implementation(platform(Dependencies.composeBom))
    implementation(Dependencies.composeUI)
    implementation(Dependencies.composeUIGraphics)
    implementation(Dependencies.composeUITooling)
    implementation(Dependencies.composeMaterial3)
    implementation(Dependencies.navigationCompose)
    testImplementation(Dependencies.jUnit)
    androidTestImplementation(Dependencies.testExtJUnit)
    androidTestImplementation(Dependencies.testEspressoCore)
    androidTestImplementation(platform(Dependencies.composeBom))
    androidTestImplementation(Dependencies.testComposeUI)
    debugImplementation(Dependencies.composeToolingPreview)
    debugImplementation(Dependencies.composeUITestManifest)

    implementation(project(Modules.utilities))

    implementation(Dependencies.hiltAndroid)
    kapt(Dependencies.hiltAndroidCompiler)
    kapt(Dependencies.hiltCompiler)

    implementation(Dependencies.hiltNavigationCompose)

    implementation(Dependencies.retrofit)
    implementation(Dependencies.okhttp)
    implementation(Dependencies.moshi)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.loggingInterceptor)

    implementation(Dependencies.coroutinesCore)
    implementation(Dependencies.coroutinesAndroid)
    implementation(Dependencies.splashScreen)

    implementation(Dependencies.coil)

}

kapt {
    correctErrorTypes = true
}

