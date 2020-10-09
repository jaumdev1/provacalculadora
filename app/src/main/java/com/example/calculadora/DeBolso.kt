package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_de_bolso.*

class DeBolso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_de_bolso)
        var valor = 0
        var valor2 = 0
        var control = 0
        var controligual = 0;
        btnlimpar.setOnClickListener {
            txtprincipal.text = ""
        }
        btnlimparmemoria.setOnClickListener{
            txtprincipal.text = ""
            valor = 0;
        }
        btn0.setOnClickListener {
            if (control == 0) {
                txtprincipal.text = txtprincipal.text.toString() + "0"
            } else {
                txtprincipal.text = "0"
                control = 0
            }
        }
        btn1.setOnClickListener {
            if (control == 0) {
                txtprincipal.text = txtprincipal.text.toString() + "1"
            } else {
                txtprincipal.text = "1"
                control = 0
            }

        }
        btn2.setOnClickListener {
            if (control == 0) {
                txtprincipal.text = txtprincipal.text.toString() + "2"
            } else {
                txtprincipal.text = "2"
                control = 0
            }
        }
        btn3.setOnClickListener {
            if (control == 0) {
                txtprincipal.text = txtprincipal.text.toString() + "3"
            } else {
                txtprincipal.text = "3"
                control = 0
            }
        }
        btn4.setOnClickListener {
            if (control == 0) {
                txtprincipal.text = txtprincipal.text.toString() + "4"
            }
            else {
                txtprincipal.text = "4"
                control = 0
            }
        }
        btn5.setOnClickListener {
            if (control == 0) {
                txtprincipal.text = txtprincipal.text.toString() + "5"
            } else {
                txtprincipal.text = "5"
                control = 0
            }

        }
        btn6.setOnClickListener {
            if (control == 0) {
                txtprincipal.text = txtprincipal.text.toString() + "6"
            } else {
                txtprincipal.text = "6"
                control = 0
            }
        }
        btn7.setOnClickListener {
            if (control == 0) {
                txtprincipal.text = txtprincipal.text.toString() + "7"
            } else {
                txtprincipal.text = "7"
                control = 0
            }
        }
        btn8.setOnClickListener {
            if (control == 0) {
                txtprincipal.text = txtprincipal.text.toString() + "8"
            } else {
                txtprincipal.text = "8"
                control = 0
            }
        }
        btn9.setOnClickListener {
            if (control == 0) {
                txtprincipal.text = txtprincipal.text.toString() + "9"

            } else {
                txtprincipal.text = "9"
                control = 0
            }
        }

        btnsom.setOnClickListener {
            control = 1
            var soma = txtprincipal.text.toString()


            valor = (soma.toInt() + valor)



           txtprincipal.text = valor.toString()

            controligual = 1;

        }
        btnsub.setOnClickListener {

            control = 1
            var sub = txtprincipal.text.toString()


            valor = (sub.toInt() - valor )



            txtprincipal.text = valor.toString()

            controligual = 2;
        }
        btndiv.setOnClickListener {
            control = 1
            var div = txtprincipal.text.toString()


            valor = div.toInt()






            txtprincipal.text = valor.toString()

            controligual = 3;

        }
        btnmulti.setOnClickListener {
            control = 1
            var multi = txtprincipal.text.toString()


            valor =  multi.toInt()



            txtprincipal.text = valor.toString()

            controligual = 4;

        }
        btnigual.setOnClickListener {
          if(controligual == 1){
              control = 1
              var soma = txtprincipal.text.toString()


              valor = (soma.toInt() + valor)



              txtprincipal.text = valor.toString()

              controligual = 1;
          }
            if(controligual == 2){

                control = 1
                var sub = txtprincipal.text.toString()


                valor = (valor - sub.toInt())



                txtprincipal.text = valor.toString()

                controligual = 2;

            }
            if(controligual == 3){
                control = 1
                var div = txtprincipal.text.toString()


                valor = (valor /div.toInt())



                txtprincipal.text = valor.toString()

                controligual = 3;

            }
            if(controligual == 4){
                control = 1
                var soma = txtprincipal.text.toString()


                valor = (valor * soma.toInt())



                txtprincipal.text = valor.toString()

                controligual = 4;

            }

        }

    }
}