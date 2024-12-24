package com.eagletech.demofragment.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.eagletech.demofragment.R
import com.eagletech.demofragment.model.Food

@SuppressLint("MissingInflatedId")
class DetailFoodActivity : AppCompatActivity() {
    lateinit var imageDetailFood: ImageView
    lateinit var detailTitleFood: TextView
    lateinit var detailDescriptionFood: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_food)

        imageDetailFood = findViewById(R.id.imageDetailFood)
        detailTitleFood = findViewById(R.id.detailTitleFood)
        detailDescriptionFood = findViewById(R.id.detailDescriptionFood)

        val food = intent.getSerializableExtra("food") as Food

        imageDetailFood.setImageResource(food.imageRes)
        detailTitleFood.text = food.title
        detailDescriptionFood.text = food.description

    }
}