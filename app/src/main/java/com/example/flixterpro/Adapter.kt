package com.example.flixterpro

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val reviewList: List<Review>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val movieImage : ImageView = itemView.findViewById(R.id.movieImage)
        val movie : TextView = itemView.findViewById(R.id.movieTitle)
        val description : TextView = itemView.findViewById(R.id.movieDescription)
    }

//    This is used to create a view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.reviews_format,parent,false)
        return ViewHolder(itemView)
    }

//    This is to bind the data with the view holder you created above.
    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val review = reviewList[position]
        holder.movie.text = review.Movie
        holder.description.text = review.Description
    }

    override fun getItemCount(): Int {
        return reviewList.size
    }
}