package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_descontos.*

class Descontos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descontos)
        btncalcular.setOnClickListener {

            var preco = edtpreco.text.toString()
            var descontos = edtdesconto.text.toString()
            var resultado = 0.0
            if (descontos.toInt() < 100 && descontos.toInt() > 0) {
                resultado = preco.toDouble() - ((preco.toDouble() * descontos.toDouble()) / 100)
                txtresuldesconto.text = " R$: " + resultado.toString()
                txtecon.text =
                    "Você economizou: R$: " + preco.toDouble() * descontos.toDouble() / 100
            } else {
                Toast.makeText(
                    this,
                    "Favor colocar um valor entre 0 e 100 % no campo de descontos",
                    Toast.LENGTH_LONG
                ).show()
            }

        }
    }
}