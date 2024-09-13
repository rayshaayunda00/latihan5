package com.rayshaayundami2b.latihan5

import android.os.Bundle
import android.view.ViewGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rayshaayundami2b.latihan5.adapter.bukuadapter
import com.rayshaayundami2b.latihan5.model.modelbuku



class RecyclerView : AppCompatActivity() {

    //view group --> bisa menampung data lebih banyak lebih cepat
    //recycle load data yg d layar aja
    private lateinit var  rv_buku : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recyclerview)

        rv_buku = findViewById(R.id.rv_buku)
        //ini kita bikin array data
        val listBuku = listOf(
            modelbuku(title = "Buku Android Kotlin 2024", penulis = "Rizki Syaputra"),
            modelbuku(title = "Buku Android Kotlin2 2024", penulis = "Rizki Syaputra"),
            modelbuku(title = "Buku Android Kotlin3 2024", penulis = "Rizki Syaputra"),
            modelbuku(title = "Buku Android Kotlin4 2024", penulis = "Rizki Syaputra"),
            modelbuku(title = "Buku Android Kotlin5 2024", penulis = "Rizki Syaputra"),
        )
        val nBukuAdapter = bukuadapter(listBuku)
        rv_buku.apply {
            layoutManager = LinearLayoutManager(this@RecyclerView) // Ganti NamaActivity dengan nama Activity Anda
            adapter = nBukuAdapter
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        }
    }
