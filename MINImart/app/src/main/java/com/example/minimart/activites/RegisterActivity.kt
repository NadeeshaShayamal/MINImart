package com.example.minimart.activites

import android.annotation.SuppressLint
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.*
import com.example.minimart.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.auth.User
import com.google.firebase.ktx.Firebase


class RegisterActivity : BaseActivity() {
    private lateinit var back_icon: ImageView
    private lateinit var back_login: TextView

    private lateinit var auth: FirebaseAuth


    //Register page validation
    private lateinit var firstname: TextView
    private lateinit var lastname: TextView
    private lateinit var emailAddress: EditText
    private lateinit var password: EditText
    private lateinit var confirmPassword: EditText
    private lateinit var registerCheckbox: CheckBox
    private lateinit var Register: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Initialize Firebase Auth
            auth = Firebase.auth


            firstname = findViewById(R.id.firstname)
            lastname = findViewById(R.id.lastname)
            emailAddress = findViewById(R.id.emailAddress)
            password = findViewById(R.id.password)
            confirmPassword = findViewById(R.id.confirmPassword)
            registerCheckbox = findViewById(R.id.registerCheckbox)
            Register = findViewById(R.id.Register)

            Register.setOnClickListener {


                val username = firstname.text.toString().trim()
                val usernamelast = lastname.text.toString().trim()
                val email = emailAddress.text.toString().trim()
                val password1 = password.text.toString().trim()
                val conpassword = confirmPassword.text.toString().trim()
                //val checkBox = registerCheckbox.text.toString().trim()


                if (username.isEmpty()) {
                    firstname.error = "Enter First Name"
                    return@setOnClickListener
                } else if (usernamelast.isEmpty()) {
                    lastname.error = "Enter Last Name"
                    return@setOnClickListener
                } else if (email.isEmpty()) {
                    emailAddress.error = "Enter Email Address"
                    return@setOnClickListener
                } else if (password1.isEmpty()) {
                    password.error = "Enter Password"
                    return@setOnClickListener
                } else if (conpassword.isEmpty()) {
                    confirmPassword.error = "Enter Confirm Password"
                    return@setOnClickListener
                } else {
                    Toast.makeText(this, "validation Completed", Toast.LENGTH_LONG).show()

                }
            }


             Register.setOnClickListener {

            }


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


            back_login = findViewById(R.id.back_login)
            // on click listener event...
            back_login.setOnClickListener {
                //lunch Login Activity
                startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
                finish() //call Activity and After activity should be closed
            }
            back_icon = findViewById(R.id.back_icon)
            // on click listener event...
            back_icon.setOnClickListener {
                //lunch Login Activity
                startActivity(Intent(this@RegisterActivity, LoginActivity::class.java))
                finish() //call Activity and After activity should be closed
            }
        }


    }



















