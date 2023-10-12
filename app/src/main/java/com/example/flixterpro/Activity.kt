package com.example.flixterpro

import DataRepository
import NetworkClient
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Activity : AppCompatActivity() {

    private val apiKey = BuildConfig.API_KEY
    private val networkClient = NetworkClient(apiKey)
    private val dataRepository = DataRepository(NetworkClient)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fetchData()
    }

    private fun fetchData() {
        dataRepository.getMovieReviews(1) { reviews, error ->
            if (error != null) {
                // Handle the error, e.g., show an error message
            } else {
                // Handle the retrieved reviews data, e.g., update UI
                processReviews(reviews)
            }
        }
    }

    private fun processReviews(reviews: List<Review>?) {
        if (reviews != null) {
            // Process and display reviews in your UI
            // For example, use a RecyclerView or TextView to show the reviews
        }
    }
}