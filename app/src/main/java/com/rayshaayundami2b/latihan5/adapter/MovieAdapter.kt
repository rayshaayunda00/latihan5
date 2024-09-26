package com.rayshaayundami2b.latihan5.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.rayshaayundami2b.latihan5.DetailHeroActivity
import com.rayshaayundami2b.latihan5.R
import com.rayshaayundami2b.latihan5.RecycleViewCardMovie
import com.rayshaayundami2b.latihan5.model.ModelMovie

class MovieAdapter(
    private val getActivity: RecycleViewCardMovie,
    private val movieList: List<ModelMovie>,
    private val onItemClick: (Int) -> Unit
) :
    RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: android.view.View) : RecyclerView.ViewHolder(itemView) {
        //deklarasi widget dari item layout
        val txtMovie: TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgMovie)
        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)

        // Menambahkan event klik
        holder.itemView.setOnClickListener {
            val intent = Intent(
                getActivity,
                DetailHeroActivity::class.java)

            intent.putExtra(
                "imageResId",
                movieList[position].image
            ) // Mengirim imageResId ke Activity PhotoDetail
            intent.putExtra("title", movieList[position].title)
            intent.putExtra("tanggal", movieList[position].tanggal)
            intent.putExtra("sinopsis", movieList[position].sinopsis)

            getActivity.startActivity(intent)
        }
    }
}


