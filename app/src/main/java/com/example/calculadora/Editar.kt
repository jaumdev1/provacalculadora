package com.example.calculadora

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_editar.*
import kotlinx.android.synthetic.main.activity_main.*

class Editar : AppCompatActivity() {
    private lateinit var pref: SharedPreferences;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar)
        pref = getSharedPreferences(getString(R.string.texto), Context.MODE_PRIVATE)
        btnenviar.setOnClickListener{
          recordData()
        }
    }
    private fun recordData(){
        val texto = edittexto.text.toString()


        if(texto.isNotEmpty()){
            val editor = pref.edit()

            editor.putString(getString(R.string.texto), texto)
            editor.apply()
            val myintent = Intent(this@Editar, MainActivity::class.java).apply {

            }
            startActivity(myintent)
        } else {
            Toast.makeText(
                this,
                "Favor preencher o campo de nome",
                Toast.LENGTH_LONG
            ).show()
        }


    }

    private fun enviartexto(){

val texto = edittexto.text.toString()
if(texto.isNotEmpty()){
    val intent = Intent(this@Editar, MainActivity::class.java).apply {
        putExtra("texto", texto)
    }
    startActivity(intent)
} else {
    Toast.makeText(
        this,
        "Favor preencher o campo de nome",
        Toast.LENGTH_LONG
    ).show()
}
}
    }

