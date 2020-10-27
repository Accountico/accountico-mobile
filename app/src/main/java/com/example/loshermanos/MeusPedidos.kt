package com.example.loshermanos

<<<<<<< HEAD
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "meuspedidos")
class MeusPedidos: Serializable {

    @PrimaryKey
=======
import java.io.Serializable

class MeusPedidos: Serializable {
>>>>>>> ddc150635d81b3b7d6415845abd7b4f4f8f78de2
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