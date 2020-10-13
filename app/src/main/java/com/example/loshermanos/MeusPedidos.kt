package com.example.loshermanos

import java.io.Serializable

class MeusPedidos: Serializable {
    var id: Long = 0
    var nome = ""
    var sabor = ""
    var valor = ""
    var data = ""
    var foto = ""

    override fun toString(): String {
        return "Pedido(id=$id)"
    }
}