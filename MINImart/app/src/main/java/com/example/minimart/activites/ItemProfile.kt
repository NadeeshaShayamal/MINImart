package com.example.minimart.activites

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ImageView
import com.example.minimart.R

class ItemProfile : AppCompatActivity() {
    private lateinit var imageView5: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_profile)


        // this code to use full screen with out actionBar...
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )

            imageView5=findViewById(R.id.imageView5)
            // on click listener event...
            imageView5.setOnClickListener {
                //lunch main Activity
                startActivity(Intent(this@ItemProfile, Home::class.java))
                finish() //call Activity and After activity should be closed
            }

        }
    }
}