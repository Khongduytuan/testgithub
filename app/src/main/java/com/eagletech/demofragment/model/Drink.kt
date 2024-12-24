package com.eagletech.demofragment.model

import java.io.Serializable

data class Drink(
    val imageDrink: Int,
    val nameDrink: String,
    val descriptionDrink: String
) : Serializable
