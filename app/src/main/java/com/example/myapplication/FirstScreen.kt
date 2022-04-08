package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FirstScreen : AppCompatActivity() {
    lateinit var callIt: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_firstscreen)
        callIt = findViewById(R.id.callIt) as Button
        callIt.setOnClickListener() {
            var intent = Intent(this, SecondScreen::class.java)
            startActivity(intent)
        }
    }
}