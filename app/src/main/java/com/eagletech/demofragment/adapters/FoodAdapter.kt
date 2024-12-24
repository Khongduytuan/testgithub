package com.eagletech.demofragment.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.eagletech.demofragment.R
import com.eagletech.demofragment.model.Food

class FoodAdapter(
    private val foods: List<Food>,
    private val onClickItem: (Food) -> Unit
) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    inner class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageFood: ImageView = itemView.findViewById(R.id.imageFood)
        val titleFood: TextView = itemView.findViewById(R.id.titleFood)
        val descriptionFood: TextView = itemView.findViewById(R.id.descriptionFood)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun getItemCount(): Int {
        return foods.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foods[position]
        holder.imageFood.setImageResource(food.imageRes)
        holder.titleFood.text = food.title
        holder.descriptionFood.text = food.description

        holder.itemView.setOnClickListener {
            onClickItem(food)
        }

    }
}