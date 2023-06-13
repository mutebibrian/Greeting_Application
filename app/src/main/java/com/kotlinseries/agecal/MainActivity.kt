package com.kotlinseries.agecal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring views
        val edit :EditText =findViewById(R.id.ethello)
        val btn = findViewById<Button>(R.id.btnhello)

        //Adding functionalities
        btn.setOnClickListener {
            var entered_text = edit.text
            Toast.makeText(this,"Hello "+entered_text,Toast.LENGTH_LONG).show()
        }
    }

}