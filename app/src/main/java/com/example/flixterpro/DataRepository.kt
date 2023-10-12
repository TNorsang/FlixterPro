import com.example.flixterpro.Review
import java.io.IOException

class DataRepository(private val apiKey: String) {

    private val networkClient = NetworkClient(apiKey)

    fun getMovieReviews(movieId: Int, callback: (List<Review>?, Exception?) -> Unit) {
        networkClient.fetchData(apiKey) { response ->
            if (response != null) {
                val reviews = parseReviewsFromJson(response)
                callback(reviews, null) // Success
            } else {
                callback(null, Exception("Failed to fetch reviews"))
            }
        }
    }

    private fun parseReviewsFromJson(jsonString: String): List<Review> {
        // JSON parsing logic here, matching the structure of your Review data class
        return emptyList()
    }
}
