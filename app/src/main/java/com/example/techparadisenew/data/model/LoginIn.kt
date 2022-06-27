package com.example.techparadisenew.data.model

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.techparadisenew.R
import com.example.techparadisenew.signUp

class LoginIn : AppCompatActivity() {

    private lateinit var signUpBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signUpBtn = findViewById(R.id.signUp)

        signUpBtn.setOnClickListener{
            val intent = Intent(this@LoginIn,signUp::class.java)
            startActivity(intent)
        }
    }
}