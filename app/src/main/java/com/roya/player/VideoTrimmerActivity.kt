package com.roya.player

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class VideoTrimmerActivity : AppCompatActivity() {

    private lateinit var btnStartTrim: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_trimmer)

        btnStartTrim = findViewById(R.id.btnStartTrim)

        // تنفيذ عملية قص الفيديو (المدة والأبعاد)
        btnStartTrim.setOnClickListener {
            performVideoTrimmingAndCropping()
        }
    }

    private fun performVideoTrimmingAndCropping() {
        // هنا يتم دمج أوامر معالجة الفيديو وقصه عبر مكتبة المعالجة
        Toast.makeText(this, "جاري معالجة وقص الفيديو...", Toast.LENGTH_SHORT).show()
    }
}
