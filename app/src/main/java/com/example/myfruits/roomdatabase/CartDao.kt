package com.example.myfruits.roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.myfruits.model.Cart


@Dao
interface CartDao {
    @Insert
     suspend fun addToCart(cart: Cart)

    @Query("SELECT * FROM cart")
    suspend fun getNotes(): List<Cart>

    @Query("SELECT EXISTS (SELECT 1 FROM cart WHERE id=:id)")
    fun isAddToCart(id: Int): Int

    @Query("select COUNT (*) from cart")
    fun countCart(): Int

    @Query("DELETE FROM cart WHERE id=:id ")
    fun deleteItem(id: Int): Int

//    @Query("SELECT * FROM Cart")
//    suspend fun getCart(cart: Cart): List<Cart>


}
