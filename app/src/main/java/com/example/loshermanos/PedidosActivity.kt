package com.example.loshermanos

import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_pedidos.*
import kotlinx.android.synthetic.main.toolbar.*

class PedidosActivity : DegubActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedidos)
        this.generic_layout = layoutMenuLateral

        setSupportActionBar(toolbar)
        supportActionBar?.title = "Fazer Pedido"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        configuraMenuLateral()

        btn_fzr_pedido.setOnClickListener{
            val p = MeusPedidos()
            p.nome = nome_cliente.text.toString()
            p.sabor = sabor_cliente.text.toString()
            p.valor = valor_total.text.toString()
            p.data = data_pedido.text.toString()
            p.foto = foto_pedido.text.toString()
            Thread{
                MeusPedidosService.savePedido(p)
                runOnUiThread {
                    finish()
                }
            }.start()
        }


    }




    }
