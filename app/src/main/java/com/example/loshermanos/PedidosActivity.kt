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


    }




    }
