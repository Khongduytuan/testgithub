package com.eagletech.demofragment.model

import java.io.Serializable

data class Food(
    val imageRes: Int,
    val title: String,
    val description: String
) : Serializable
