package com.example.loshermanos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MeusPedidosDAO {
    @Query("SELECT * FROM meuspedidos WHERE id =:id")
    fun getById(id: Long): MeusPedidos?

    @Query(" SELECT * FROM meuspedidos")
    fun findAll(): List<MeusPedidos>

    @Insert
    fun insert(meusPedidos: MeusPedidos)

    @Delete
    fun delete (meusPedidos: MeusPedidos)

}