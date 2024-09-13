package com.rayshaayundami2b.latihan5.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rayshaayundami2b.latihan5.R
import com.rayshaayundami2b.latihan5.model.modelbuku


class bukuadapter (private val rv_buku: List<modelbuku>) :
    RecyclerView.Adapter<bukuadapter.BukuAdapterHolder>() {

    //view holder yang digunakan unutk menyimpan referensi layout item
    class BukuAdapterHolder(view: View) : RecyclerView.ViewHolder(view){
        val txtJudul : TextView = view.findViewById(R.id.txtJudulBuku)
        val txtPenulis : TextView = view.findViewById(R.id.txtPenulis)
    }

    //pengaturan data item pada setiap list dari recycle view
    override fun onBindViewHolder(holder: BukuAdapterHolder, position: Int) {

        holder.txtPenulis.text = rv_buku[position].penulis
        holder.txtJudul.text = rv_buku[position].title
    }

    //membuat layout list item sebagai item dari recycle view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuAdapterHolder {

        val  view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list2, parent, false)
        return  BukuAdapterHolder(view)
    }

    //mengembalikan panjang nilai dari data
    override fun getItemCount(): Int{
        return rv_buku.size
    }

}