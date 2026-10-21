dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    
    // Media3 (ExoPlayer)
    implementation("androidx.media3:media3-exoplayer:1.2.0")
    implementation("androidx.media3:media3-ui:1.2.0")

    // مكتبة معالجة الفيديو (مع التأكد من تفعيل jitpack في settings.gradle.kts)
    implementation("com.github.microshow:RFFmpeg:1.7.3")
}
