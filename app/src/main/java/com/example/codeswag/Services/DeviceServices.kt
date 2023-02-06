package com.example.codeswag.Services

import com.example.codeswag.Model.Category
import com.example.codeswag.Model.Products

object DataServices {
    val category= listOf<Category>(
        Category("HATS","hatimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("DIGITAL","digitalgoodsimage")
    )
    val hat= listOf(
        Products("red hat","100$","hat1"),
        Products("white hat jr","90$","hat2"),
        Products("chintu hat","99$","hat3"),
        Products("Dope hat","500$","hat4")
    )
    val shits= listOf(
        Products("white shirt","1$","shirt1"),
        Products("black shirt","4$","shirt2"),
        Products("red shirt","1$","shirt3"),
        Products("pink shirt","1$","shirt3"),
        Products("blue shirt","1$","shirt4")
    )
    val hoodie= listOf(
        Products("Dev hoodie","8$","hoodie1"),
        Products("Dev hoodie red","12$","hoodie2"),
        Products("Dev hoodie blue","7$","hoodie3"),
        Products("Dev hoodie classic ","3$","hoodie4"),
    )

}