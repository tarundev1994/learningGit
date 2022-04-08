package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondScreen : AppCompatActivity() {
    lateinit var user: User
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_second_screen)
        user = User("tarun", 7788966)
        textView=findViewById(R.id.texView1) as TextView
        textView.text="Welcome Mr. ${user.name} and number is ${user.number}"
    }
}