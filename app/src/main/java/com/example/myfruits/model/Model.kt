package com.example.myfruits.model

import com.google.gson.annotations.SerializedName

// todo
// 1. mungkin direfactor jadi kelas "Product": rename file sama rename nama class
// 2. kalo mau dipake untuk kebutuhan lain yang ga nembak api, bisa di sesuaikan dengan field api. Ini sementara belum dipake dimana2 di file.
// ini bisa hapus karena udah ada MainModel, MainModdel di rename dan dipindah ke sini

class MyProductData(
    @field:SerializedName("id")
    var id: Int,

    @field:SerializedName("title")
    var productName: String,

    @field:SerializedName("primage")
    var primage: String,

    @field:SerializedName("prprice")
    var prprice: String
)