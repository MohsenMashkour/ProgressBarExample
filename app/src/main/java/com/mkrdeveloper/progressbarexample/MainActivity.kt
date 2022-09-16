package com.mkrdeveloper.progressbarexample

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pBar = findViewById<ProgressBar>(R.id.progressBar)

        pBar.max = 10000

        val currentProgress = 7000

        ObjectAnimator.ofInt(pBar,"progress",currentProgress)
            .setDuration(5000)
            .start()
    }
}