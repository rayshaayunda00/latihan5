package com.rayshaayundami2b.latihan5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class diskon : AppCompatActivity() {

    private lateinit var harga: EditText
    private lateinit var submitt: Button
    private lateinit var diskonn: TextView
    private lateinit var totall: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diskon)

        harga = findViewById(R.id.input)
        submitt = findViewById(R.id.klik)
        diskonn = findViewById(R.id.diskonnn)
        totall = findViewById(R.id.txttotal)

        submitt.setOnClickListener() {

            val nHarga = harga.text.toString().toDouble()

            if (nHarga < 100000) {
                val a = nHarga
                diskonn.setText("Diskon 0%")
                totall.setText("Rp. " + a)
            } else if (nHarga >= 100000 && nHarga <= 500000) {
                val a = nHarga - (nHarga * 0.1)
                diskonn.setText("Diskon 10%")
                totall.setText("Rp. " + a)
            } else if (nHarga >= 500000 && nHarga <= 1000000) {
                val a = nHarga - (nHarga * 0.2)
                diskonn.setText("Diskon 20%")
                totall.setText("Rp. " + a)
            } else if (nHarga > 1000000) {
                val a = nHarga - (nHarga * 0.3)
                diskonn.setText("Diskon 30%")
                totall.setText("Rp. " + a)
            }


            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
}