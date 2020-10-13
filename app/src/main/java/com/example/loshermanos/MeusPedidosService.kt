package com.example.loshermanos

object MeusPedidosService {

    fun getPedidos(): List<MeusPedidos>{
        val pedidos = mutableListOf<MeusPedidos>()

        for (i in 1..5){
            val p = MeusPedidos()
            p.nome = "Nome $i"
            p.sabor = "Sabor $i"
            p.valor = "Valor $i"
            p.data = "Data $i"
            p.foto = "https://diariodorio.com/wp-content/uploads/2020/07/daleopizzaria_20200710_144435_0.jpg"
            pedidos.add(p)

        }
        return pedidos
    }
}