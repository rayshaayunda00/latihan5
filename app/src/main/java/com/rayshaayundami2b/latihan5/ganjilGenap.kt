package com.rayshaayundami2b.latihan5

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ganjilGenap : AppCompatActivity() {

    private lateinit var angka1 : EditText
    private lateinit var klik : Button
    private lateinit var hasill : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ganjil_genap)

        angka1 = findViewById(R.id.angka)
        klik = findViewById(R.id.submit)
        hasill = findViewById(R.id.hasil)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        klik.setOnClickListener(){
            val angkaa = angka1.text.toString().toInt()

            if (angkaa % 2 == 0){
                hasill.setText(" " + angkaa + " adalah bilangan genap")
            } else{
                hasill.setText(" " + angkaa + " adalah bilangan ganjil")
            }

        }

    }
}