package com.example.proyecto_rentas.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.proyecto_rentas.databinding.ActivityArrendarPagoBinding

class ArrendarPago : AppCompatActivity() {
    lateinit var binding: ActivityArrendarPagoBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityArrendarPagoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cancl.setOnClickListener{
            val lanzar= Intent(this, Search::class.java)
            startActivity(lanzar)
        }

        binding.sig.setOnClickListener{
            val lanzar= Intent(this, ArrendarFin::class.java)
            startActivity(lanzar)
        }
    }
}