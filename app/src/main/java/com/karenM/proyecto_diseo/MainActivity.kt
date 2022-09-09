package com.karenM.proyecto_diseo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button  = findViewById(R.id.button2)
        btn.setOnClickListener{

            val intent: Intent = Intent(this, pantallanumero2::class.java)
            startActivity(intent)


        }
    }
}