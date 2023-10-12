package com.example.flixterpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Access the API key
        val apiKey = BuildConfig.API_KEY

        // Log the API key for verification
        Log.d("API_KEY", apiKey)
        // You can use the API key here or in subsequent methods
    }

    // Other methods and code for your MainActivity

}