package com.example.minimart.activites

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import com.example.minimart.R

class LoginActivity : AppCompatActivity() {
    private lateinit var Register: Button
    private lateinit var login_register:TextView
    private lateinit var login_forget_password: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

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
        login_register=findViewById(R.id.login_register)
       // on click listener event...
        login_register.setOnClickListener {
            //lunch main Activity
            startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
            finish() //call Activity and After activity should be closed
        }

        login_forget_password=findViewById(R.id.login_forget_password)
        // on click listener event...
        login_forget_password.setOnClickListener {
            //lunch main Activity
            startActivity(Intent(this@LoginActivity, ForgetPasswordActivity::class.java))
            finish() //call Activity and After activity should be closed
        }

        Register=findViewById(R.id.Register)
        Register.setOnClickListener {
            startActivity(Intent(this@LoginActivity,Home::class.java))
            finish()
        }
    }


        }



