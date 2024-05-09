package com.example.tamagotchiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<Button>(R.id.introBTN)
        next.setOnClickListener {
            val intent = Intent( this@MainActivity, MainActivity2 ::class.java)
            startActivity(intent)
        }
    }
}