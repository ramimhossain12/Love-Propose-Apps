package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {


    lateinit var h: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        h = Handler()
        h.postDelayed({

            // Delay and Start Activity
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        } , 3000) // here we're delaying to startActivity after 3seconds


    }
}

