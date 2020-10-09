package com.example.calculadora

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var pref: SharedPreferences;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        pref = getSharedPreferences(getString(R.string.texto), Context.MODE_PRIVATE)

        //PEGANDO O VALOR ARMAZENADO NA MEMORIA ATRAVES DA FUNÇÃO GETDATA
        getData()

        //BOTÕES
        btneditar.setOnClickListener {
            editar()
        }
        btnbolso.setOnClickListener {
            deBolso()
        }
        btntemperatura.setOnClickListener {
            temperatura()
        }
        btndescontos.setOnClickListener {
            descontos()
        }


    }

    private fun getData() {
        val texto = pref.getString("texto", null)
        textoView.text = texto;
    }

    private fun editar() {
        val intent = Intent(this@MainActivity, Editar::class.java).apply {

        }
        startActivity(intent)
    }

    private fun deBolso() {
        val deBolsointent = Intent(this@MainActivity, DeBolso::class.java).apply {

        }
        startActivity(deBolsointent)
    }

    private fun temperatura() {
        val temperaturaintent = Intent(this@MainActivity, Temperatura::class.java).apply {

        }
        startActivity(temperaturaintent)
    }

    private fun descontos() {
        val descontosintent = Intent(this@MainActivity, Descontos::class.java).apply {

        }
        startActivity(descontosintent)
    }


}