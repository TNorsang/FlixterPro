package com.example.flixterpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val reviewButton = findViewById<Button>(R.id.Review)
        reviewButton.setOnClickListener {
            val intent = Intent(this, testpage.xml)
            startActivity(intent)
        }
    }
}