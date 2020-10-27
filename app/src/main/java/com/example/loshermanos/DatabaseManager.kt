package com.example.loshermanos

import androidx.room.Room

object DatabaseManager {

    private var dbInstance: LoshermanosDatabase

    init {
        val contexto = LoshermanosApplication.getInstance().applicationContext
        dbInstance= Room.databaseBuilder(
                contexto,
                LoshermanosDatabase::class.java,
                "LosHermanos.sqllite"
        ).build()
    }
    fun getPedidoDAO(): MeusPedidosDAO{
        return dbInstance.MeusPedidosDAO()
    }
}