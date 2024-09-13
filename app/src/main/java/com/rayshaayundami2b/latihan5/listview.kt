package com.rayshaayundami2b.latihan5

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class listview : AppCompatActivity() {
    private lateinit var listview: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_listview)

        listview = findViewById(R.id.btnlistview)


        //listview
        //listview widget -> Adapter -> Data Source (Array List)

        //bikin array list
        val namaHewan =
            listOf("Gajah", "Kucing", "Kupu-kupu", "Beruang", "Kelinci", "Kambing", "Sapi")
        //kita masukkan data array hewan ke adapter

        //android layout ->
        listview.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namaHewan)

    // untuk bisa di klik setiap item dari listnya

        listview.setOnItemClickListener(){
                parent,view, position, id ->
            Toast.makeText(this, "Anda memilih : ${namaHewan[position]}",
                Toast.LENGTH_SHORT).show()

           }

}
}