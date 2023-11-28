plugins {
    id("com.android.application")
}

android {
    namespace = "com.pmdm.codelab1"
    compileSdk = 33


    defaultConfig {
        applicationId = "com.pmdm.codelab1"
        minSdk = 33
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.android.volley:volley:1.2.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.21")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("com.android.support:support-annotations:28.0.0")
    implementation("androidx.annotation:annotation:1.7.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("androidx.test:core:1.5.0")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test:runner:1.6.0-alpha04")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.6.0-alpha01")


}