package com.example.myfruits.retrofit


//rename file to "Product"
 data class MainModel (
     val id :String,
     val createdAt :String,
     val title: String,
     val photo:String,
     val price:String,
     val urlSource:String
 )