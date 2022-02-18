package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainTextView = findViewById<TextView>(R.id.main_text_view)

        val profile = Profile()

        findViewById<Button>(R.id.main_button).setOnClickListener {
            mainTextView.text = "name: " + profile.name + " age: " + profile.age
        }
    }
}