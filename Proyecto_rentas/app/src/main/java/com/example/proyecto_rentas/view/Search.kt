package com.example.proyecto_rentas.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyecto_rentas.databinding.ActivityBusquedaBinding

class Search: AppCompatActivity() {

    lateinit var binding: ActivityBusquedaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBusquedaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imageView4.setOnClickListener{
            val lanzar = Intent(this, vistaCasa::class.java)
            startActivity(lanzar)
        }

        binding.imageView5.setOnClickListener{
            val lanzar = Intent(this, vistaCasa1::class.java)
            startActivity(lanzar)
        }

        binding.imageView6.setOnClickListener{
            val lanzar = Intent(this, vistaCasa2::class.java)
            startActivity(lanzar)
        }

        binding.imageView7.setOnClickListener{
            val lanzar = Intent(this, vistaCasa3::class.java)
            startActivity(lanzar)
        }

        binding.imageView8.setOnClickListener{
            val lanzar = Intent(this, vistaCasa4::class.java)
            startActivity(lanzar)
        }

        binding.imageView11.setOnClickListener{
            val lanzar = Intent(this, vistaCasa5::class.java)
            startActivity(lanzar)
        }

        binding.imageView12.setOnClickListener{
            val lanzar = Intent(this, vistaCasa6::class.java)
            startActivity(lanzar)
        }

        binding.imageView13.setOnClickListener{
            val lanzar = Intent(this, vistaCasa7::class.java)
            startActivity(lanzar)
        }

    }
}