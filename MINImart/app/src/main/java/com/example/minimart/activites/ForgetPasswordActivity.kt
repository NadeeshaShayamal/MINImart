package com.example.minimart.activites

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.ImageView
import com.example.minimart.R

class ForgetPasswordActivity : BaseActivity() {
    private lateinit var back_icon: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foget_password)
// this code to use full screen with out actionBar...
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
        back_icon = findViewById(R.id.back_icon)
        // on click listener event...
        back_icon.setOnClickListener {
            //lunch Login Activity
            startActivity(Intent(this@ForgetPasswordActivity, LoginActivity::class.java))
            finish() //call Activity and After activity should be closed
        }
    }
}