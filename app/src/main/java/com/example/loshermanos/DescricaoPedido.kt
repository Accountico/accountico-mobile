package com.example.loshermanos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_descricao.*
import kotlinx.android.synthetic.main.activity_pedidos.*
import kotlinx.android.synthetic.main.activity_pedidos.layoutMenuLateral
import kotlinx.android.synthetic.main.activity_tela_inicial.*
import kotlinx.android.synthetic.main.toolbar.*

class DescricaoPedido : DegubActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_descricao)
        this.generic_layout = layoutMenuLateral
        btn_inicio.setOnClickListener {inicio()}

        val pedido = intent.getSerializableExtra("Seu Pedido")
        Toast.makeText(this, "$pedido", Toast.LENGTH_LONG).show()


    }
    fun inicio(){
        val int = Intent(this, TelaInicialActivity::class.java)
        startActivity(int)
    }
}