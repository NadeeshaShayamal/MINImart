package com.example.minimart.activites

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import com.example.minimart.R

class Home : AppCompatActivity() {
    private lateinit var watch:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // this code to use full screen with out actionBar...
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )

            watch=findViewById(R.id.watch)
            // on click listener event...
            watch.setOnClickListener {
                //lunch main Activity
                startActivity(Intent(this@Home, ItemProfile::class.java))
                finish() //call Activity and After activity should be closed
            }

        }
    }
}







