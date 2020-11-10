package com.example.loshermanos

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "meuspedidos")
class MeusPedidos: Serializable {
    @PrimaryKey
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