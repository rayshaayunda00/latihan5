package com.rayshaayundami2b.latihan5

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
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


    }
}