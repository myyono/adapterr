package com.example.myfruits.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Cart(
    @PrimaryKey(autoGenerate= true)
    var id: Int,

    var name: String,

    //imageid ini maksudnya imageurl, biar gambar bisa diload di daftar keranjang
    var imageid: String,

    var price: String
)
