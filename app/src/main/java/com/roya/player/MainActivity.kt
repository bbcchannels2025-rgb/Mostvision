package com.roya.player

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var imgSharingan: ImageView
    private lateinit var fabLastVideo: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgSharingan = findViewById(R.id.imgSharingan)
        fabLastVideo = findViewById(R.id.fabLastVideo)

        // تفاعل اللمس وتحريك الشارينجان (ترميش وتغيير الاتجاهات)
        imgSharingan.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    v.animate().scaleX(0.9f).scaleY(0.9f).setDuration(150).start()
                    true
                }
                MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                    v.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150).start()
                    // عند الضغط ورفع الإصبع تنتقل لآخر فيديو تم تشغيله
                    openLastPlayedVideo()
                    true
                }
                MotionEvent.ACTION_MOVE -> {
                    // حركة تفاعلية مع اللمس والسحب
                    v.translationX = event.x - (v.width / 2)
                    v.translationY = event.y - (v.height / 2)
                    true
                }
                else -> false
            }
        }

        // الزر العائم لتشغيل آخر فيديو
        fabLastVideo.setOnClickListener {
            openLastPlayedVideo()
        }
    }

    private fun openLastPlayedVideo() {
        val intent = Intent(this, PlayerActivity::class.java)
        // تمرير علامة لتشغيل آخر مسار محفوظ
        intent.putExtra("PLAY_LAST", true)
        startActivity(intent)
    }
}
