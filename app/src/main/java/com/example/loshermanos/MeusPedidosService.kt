package com.example.loshermanos


import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MeusPedidosService {

    fun getPedidos(): List<MeusPedidos>{

        return DatabaseManager.getPedidoDAO().findAll()


    }

    fun savePedido(pedidos: MeusPedidos){
        DatabaseManager.getPedidoDAO().insert(pedidos)
    }
    inline fun <reified T> parseJson(json: String): T{
        val type = object: TypeToken<T>(){}.type
        return Gson().fromJson<T>(json, type)
    }


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
}
