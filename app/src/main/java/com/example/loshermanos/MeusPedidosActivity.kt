package com.example.loshermanos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_meus_pedidos.*
import kotlinx.android.synthetic.main.activity_pedidos.*
import kotlinx.android.synthetic.main.activity_pedidos.layoutMenuLateral
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.toolbar.*

class MeusPedidosActivity : DegubActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meus_pedidos)

        this.generic_layout = layoutMenuLateral

        setSupportActionBar(toolbar)
        supportActionBar?.title = "Meus Pedidos"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        configuraMenuLateral()

        recyclerPedido?.layoutManager = LinearLayoutManager(this)
        recyclerPedido?.itemAnimator = DefaultItemAnimator()
        recyclerPedido?.setHasFixedSize(true)

        btn_inicio.setOnClickListener {
            var intent = Intent(this, TelaInicialActivity::class.java)
            startActivity(intent)
    }

    }
    override fun onResume() {
        super.onResume()
        taskPedidos()

    }
    var pedido = listOf<MeusPedidos>()

    fun taskPedidos(){
        this.pedido = MeusPedidosService.getPedidos()
        recyclerPedido?.adapter = MeusPedidosAdapter(this.pedido) {onClickPedido(it)}
    }
    fun onClickPedido(pedido:MeusPedidos){
        val it = Intent(this, DescricaoPedido::class.java)
        it.putExtra("Seu Pedido", pedido)
        startActivity(it)


    }
}