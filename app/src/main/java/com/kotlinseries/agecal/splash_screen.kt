package com.kotlinseries.agecal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        //splash delay 4seconds
        Handler().postDelayed({
//start activity
            startActivity(Intent(this,MainActivity::class.java))
            //finish Activity
            finish()

        },4000
        )
    }
}
//Create a splashscreen and add in animations
// where a company logo from top to the centre