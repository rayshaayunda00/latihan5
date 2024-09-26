package com.rayshaayundami2b.latihan5

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rayshaayundami2b.latihan5.adapter.MovieAdapter
import com.rayshaayundami2b.latihan5.model.ModelMovie
import java.util.ArrayList

class RecycleViewCardMovie : AppCompatActivity() {

    private var recyclerView : RecyclerView? = null
    private var movieAdapter : MovieAdapter? = null
    private var movieList = mutableListOf<ModelMovie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_view_card_movie)

        movieList = ArrayList()
        recyclerView = findViewById(R.id.rvMovieList) as RecyclerView
        movieAdapter = MovieAdapter(this,movieList){ position ->
            showDetailDialog(position as Int)
        }
        val layoutManager : RecyclerView.LayoutManager = GridLayoutManager(this,2)
        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.adapter = movieAdapter

        prepareMovielist()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }



    private fun prepareMovielist() {
        var movie = ModelMovie("Avatar", R.drawable.avatar, "27 November 2023", getString(R.string.sinopsis1))
        movieList.add(movie)
        movie = ModelMovie("Batman",  R.drawable.batman,"26 November 2024",getString(R.string.sinopsis1))
        movieList.add(movie)
        movie = ModelMovie("End Game", R.drawable.end_game, "20 Desember 2024",getString(R.string.sinopsis2))
        movieList.add(movie)
        movie = ModelMovie("Hulk", R.drawable.hulk, "12 April 2024",getString(R.string.sinopsis3))
        movieList.add(movie)
        movie = ModelMovie("Inception", R.drawable.inception, "20 Maret 2024",getString(R.string.sinopsis1))
        movieList.add(movie)
        movie = ModelMovie("Jumanji", R.drawable.jumanji, "17 Agustus 2024",getString(R.string.sinopsis2))
        movieList.add(movie)
        movie = ModelMovie("Lucy", R.drawable.lucy, "04 November 2024",getString(R.string.sinopsis3))
        movieList.add(movie)
        movie = ModelMovie("Jurassic World", R.drawable.jurassic_world, "10 Oktober 2024",getString(R.string.sinopsis2))
        movieList.add(movie)
        movie = ModelMovie("Spider Man", R.drawable.spider_man,"11 November 2024",getString(R.string.sinopsis3))
        movieList.add(movie)
        movie = ModelMovie("Venom", R.drawable.venom,"19 November 2024",getString(R.string.sinopsis1))
        movieList.add(movie)

        movieAdapter!!.notifyDataSetChanged()
    }

    private fun showDetailDialog(position: Int) {
        val intent = Intent(this,DetailHeroActivity::class.java)
        intent.putExtra("imageResId",movieList[position].image)
        intent.putExtra("txtjudul", movieList[position].title)
        startActivity(intent)
    }

}