import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Callback
import okhttp3.Response
import java.io.IOException

class NetworkClient(private val apiKey : String) {
    private val client = OkHttpClient()

    fun fetchData(apiKey: String, callback: (String?) -> Unit) {
        val url = "https://api.themoviedb.org/3/movie/movie_id/reviews?language=en-US&page=1&api_key=$apiKey"
        val request = Request.Builder()
            .url(url)
            .get()
            .addHeader("accept", "application/json")
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: okhttp3.Call, e: IOException) {
                // Handle network error
                callback(null)
            }

            override fun onResponse(call: okhttp3.Call, response: Response) {
                val responseBody = response.body?.string()
                callback(responseBody)
            }
        })
    }
}
