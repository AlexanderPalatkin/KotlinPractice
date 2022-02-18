package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstMainTextView = findViewById<TextView>(R.id.first_main_text_view)
        val secondMainTextView = findViewById<TextView>(R.id.second_main_text_view)

        val profile = Profile()
        val newCopy = profile.copy(name = "Alex")

        findViewById<Button>(R.id.main_button).setOnClickListener {
            firstMainTextView.text = "name: " + profile.name + " age: " + profile.age
            secondMainTextView.text = "name: " + newCopy.name + " age: " + newCopy.age
        }
    }
}