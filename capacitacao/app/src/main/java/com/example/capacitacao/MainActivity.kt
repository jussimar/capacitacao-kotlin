package com.example.capacitacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var btnSalvar: Button
    lateinit var nome: TextView
    lateinit var ano: TextView
    lateinit var resultadoNome: TextView
    lateinit var resultadoIdade: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSalvar = findViewById(R.id.btnSalvar);
        nome = findViewById(R.id.txtNome)
        resultadoNome = findViewById(R.id.resultadoNome)
        resultadoIdade = findViewById(R.id.resultadoIdade)
        ano = findViewById(R.id.txtAnoNasc)


        btnSalvar.setOnClickListener(){
            resultadoNome.text = nome.text
            var anoCalculo = ano.text.toString()
            var total = 2021 - anoCalculo.toShort()
            var resultado = "";


            if(total>=18){
                resultado = "Idade:$total - Maior de Idade "
                resultadoIdade.text = resultado
            }else{
                resultado = "Idade:$total - Menor de Idade "
                resultadoIdade.text = resultado
            }
        }
    }
}