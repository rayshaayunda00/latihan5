package com.rayshaayundami2b.latihan5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class luasvolume : AppCompatActivity() {

    private lateinit var p : EditText
    private lateinit var l : EditText
    private lateinit var t : EditText
    private lateinit var luas : Button
    private lateinit var volume : Button
    private lateinit var hasilnya : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_luasvolume)

        p = findViewById(R.id.panjang)
        l = findViewById(R.id.lebar)
        t = findViewById(R.id.lebar)
        luas = findViewById(R.id.luas)
        volume = findViewById(R.id.volume)
        hasilnya = findViewById(R.id.hasil)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        luas.setOnClickListener {
            val panjang = p.text.toString().toDoubleOrNull()
            val lebar = l.text.toString().toDoubleOrNull()
            val tinggi = t.text.toString().toDoubleOrNull()

            if (panjang != null && lebar != null && tinggi != null) {
                val hasil = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi))
                hasilnya.setText("Luas Permukaan = $hasil")
            } else {
                hasilnya.setText("Please enter valid numbers")
            }
        }


        volume.setOnClickListener {
            val panjang = p.text.toString().toDoubleOrNull()
            val lebar = l.text.toString().toDoubleOrNull()
            val tinggi = t.text.toString().toDoubleOrNull()

            if (panjang != null && lebar != null && tinggi != null) {
                val hasil = panjang * lebar * tinggi
                hasilnya.setText("Luas Volume = $hasil")
            } else {
                hasilnya.setText("Please enter valid numbers")
            }
        }

    }
}
