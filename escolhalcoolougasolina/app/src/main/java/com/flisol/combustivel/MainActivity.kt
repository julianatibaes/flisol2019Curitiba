package com.flisol.combustivel

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular.setOnClickListener {
            // vamos verificar se algum valor do campo de texto está vazio
            if(etGasolina.text.toString().isNotEmpty() &&
                etAlcool.text.toString().isNotEmpty())
                // estou utilizando o método para realizaro cálculo e não fazendo um go horse com o algoritmo
                // aqui pra poder testa o que estou fazendo =]
                calcular(etAlcool.text.toString().toFloat(), etGasolina.text.toString().toFloat())
                else {
                    txtResultado.setText(R.string.nao_avacalhe)
                    txtValor.text = ""
                }
        }

    }

    fun calcular(alcool: Float, gasolina: Float){
        // multiplica o valor da gasolina para saber o maior valor para o álcool
        val valor = gasolina * 0.7

        // concatena a mensagem do valor com o valor máximo para o álcool
        val result = this.getString(R.string.valor_ideal) + String.format("%.2f", valor)

        // atribui o valor ao elemento de view txtValor
        txtValor.text = result

        // caso o valor do álcool seja menor que o valor máximo para o álcool, informe que ele ta mais economico
        // perceba que como estamos utilizando o id da mensagem, precisamos utilizar o método setText,
        // anteriormente, o valor estava em String, então foi possível utilizar a propriedade text
        if( alcool < valor)
            txtResultado.setText(R.string.use_alcool)
        else
            txtResultado.setText(R.string.use_gasolina)
    }
}
