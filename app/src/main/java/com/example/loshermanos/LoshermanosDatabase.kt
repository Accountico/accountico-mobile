package com.example.loshermanos

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities= arrayOf(MeusPedidos:: class), version = 2)
public abstract class LoshermanosDatabase : RoomDatabase() {
    abstract fun MeusPedidosDAO(): MeusPedidosDAO

}