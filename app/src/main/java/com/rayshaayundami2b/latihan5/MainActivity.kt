package com.rayshaayundami2b.latihan5

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnkonversisuhu = findViewById<Button>(R.id.btnkonversisuhu)
        val btndiskon = findViewById<Button>(R.id.btndiskon)
        val btnluasvolume = findViewById<Button>(R.id.btnluasvolume)
        val btnganjilgenap = findViewById<Button>(R.id.btnganjilgenap)
        val btnpissingdata = findViewById<Button>(R.id.btnpassingdata)
        val btnListView = findViewById<Button>(R.id.btnListview)
        val rv_buku = findViewById<Button>(R.id.btnRecyclerView)
        val btnRvBuah = findViewById<Button>(R.id.btnRv_Buah)
        var btnMovie = findViewById<Button>(R.id.btnMovie)


        btnkonversisuhu.setOnClickListener {
            startActivity(Intent(this, konversiSuhu::class.java))
        }

        btndiskon.setOnClickListener {
            startActivity(Intent(this, diskon::class.java))
        }

        btnluasvolume.setOnClickListener {
            startActivity(Intent(this, luasvolume::class.java))
        }

        btnganjilgenap.setOnClickListener {
            startActivity(Intent(this, ganjilGenap::class.java))
        }
        btnpissingdata.setOnClickListener {
            startActivity(Intent(this, pissingdata::class.java))
        }
        btnListView.setOnClickListener {
            startActivity(Intent(this, ListViewActivity::class.java))
        }
        rv_buku.setOnClickListener {
            startActivity(Intent(this, RecyclerView::class.java))
        }
        btnRvBuah.setOnClickListener() {
            //perpindahan dari page satu ke yg lain
            //intent
            //Intent implicit : intent yg kita buat sendiri
            //intent explicit : intent yg memanggil library atau class lain
            val intenMenu2 = Intent(this@MainActivity, CustomeImageRecycleView::class.java)
            startActivity(intenMenu2)
        }
        btnMovie.setOnClickListener(){
            //perpindahan dari page satu ke yg lain
            //intent
            //Intent implicit : intent yg kita buat sendiri
            //intent explicit : intent yg memanggil library atau class lain
            val intenMenu2 = Intent(this@MainActivity, RecycleViewCardMovie::class.java)
            startActivity(intenMenu2)
        }


    }
    }
