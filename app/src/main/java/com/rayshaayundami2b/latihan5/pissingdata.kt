package com.rayshaayundami2b.latihan5

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pissingdata : AppCompatActivity() {
    private lateinit var etusername: EditText
    private lateinit var etpassword: EditText
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pissingdata)
        etpassword = findViewById(R.id.etpassword)
        etusername = findViewById(R.id.etusername)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {
            //passing data dg intent -> m
            var intent = Intent(this@pissingdata, WelcomeActivity::class.java)
            val nUsername = etusername.text.toString()
            val nPassword = etpassword.text.toString()

            intent.putExtra("username", nUsername)
            intent.putExtra("password", nPassword)

            Log.d("username", nUsername)
            Log.d("password", nPassword)
            startActivity(intent)
        }
    }
}
