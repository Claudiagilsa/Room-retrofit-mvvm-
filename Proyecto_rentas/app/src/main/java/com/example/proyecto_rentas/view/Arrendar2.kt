package com.example.proyecto_rentas.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto_rentas.databinding.ActivityArrendar2Binding

class Arrendar2 : AppCompatActivity() {
    lateinit var binding: ActivityArrendar2Binding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityArrendar2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cancl.setOnClickListener{
            val lanzar= Intent(this, Search::class.java)
            startActivity(lanzar)
        }

        binding.sig.setOnClickListener{
            val lanzar= Intent(this, ArrendarPago::class.java)
            startActivity(lanzar)
        }
    }
}