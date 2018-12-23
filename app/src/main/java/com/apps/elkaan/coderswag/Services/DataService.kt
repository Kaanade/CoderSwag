package com.apps.elkaan.coderswag.Services

import com.apps.elkaan.coderswag.Model.Category
import com.apps.elkaan.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$19", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$19", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$19", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$30", "hoodie1"),
        Product("Devslopes Hoodie Red", "$15", "hoodie2"),
        Product("Devslopes Hoodie Blue", "$16", "hoodie3"),
        Product("Devslopes Hoodie Black", "$22", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$30", "hoodie1"),
        Product("Devslopes Hoodie Red", "$15", "hoodie2"),
        Product("Devslopes Hoodie Blue", "$16", "hoodie3"),
        Product("Devslopes Hoodie Black", "$22", "hoodie4"),
        Product("Devslopes Hoodie Gray", "$30", "hoodie1"),
        Product("Devslopes Hoodie Red", "$15", "hoodie2"),
        Product("Devslopes Hoodie Blue", "$16", "hoodie3"),
        Product("Devslopes Hoodie Black", "$22", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$14", "shirt1"),
        Product("Devslopes Badge Light Gray", "$85", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$64", "shirt3"),
        Product("Devslopes Hustle", "$20", "shirt4"),
        Product("Kickflip Studios", "$50", "shirt5"),
        Product("Devslopes Shirt Black", "$14", "shirt1"),
        Product("Devslopes Badge Light Gray", "$85", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$64", "shirt3"),
        Product("Devslopes Hustle", "$20", "shirt4"),
        Product("Kickflip Studios", "$50", "shirt5"),
        Product("Devslopes Shirt Black", "$14", "shirt1"),
        Product("Devslopes Badge Light Gray", "$85", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$64", "shirt3"),
        Product("Devslopes Hustle", "$20", "shirt4"),
        Product("Kickflip Studios", "$50", "shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}