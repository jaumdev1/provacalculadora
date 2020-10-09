package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_temperatura.*

class Temperatura : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperatura)

        var temperatura = ""
        btnconverter.setOnClickListener {
            temperatura = texttemp.text.toString()
            txtresuldesconto.text = ((temperatura.toDouble() * 1.8) + 32).toString() + "°F";

        }
        btnconverter2.setOnClickListener {
            temperatura = texttemp.text.toString()
            txtresuldesconto.text = ((temperatura.toDouble() - 32) / 1.8).toString() + "°C";
        }


    }
}