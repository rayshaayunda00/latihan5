package com.rayshaayundami2b.latihan5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rayshaayundami2b.latihan5.adapter.BuahAdapter
import com.rayshaayundami2b.latihan5.model.MockList
import com.rayshaayundami2b.latihan5.model.ModelBuah

class CustomeImageRecycleView : AppCompatActivity() {

    private lateinit var rv_buah: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custome_image_recycle_view)
        rv_buah = findViewById(R.id.rv_data)

        rv_buah.layoutManager = GridLayoutManager(this, 1,
            GridLayoutManager.VERTICAL,false)

        val adapter = BuahAdapter(MockList.getModel() as ArrayList<ModelBuah>)
        rv_buah.adapter = adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}