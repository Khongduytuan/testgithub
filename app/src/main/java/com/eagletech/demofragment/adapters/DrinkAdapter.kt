package com.eagletech.demofragment.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eagletech.demofragment.R
import com.eagletech.demofragment.model.Drink

class DrinkAdapter(
    private val drinks: List<Drink>,
    private val onClickItemDrink: (Drink) -> Unit
) : RecyclerView.Adapter<DrinkAdapter.DrinkViewHolder>() {

    inner class DrinkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageDrink: ImageView = itemView.findViewById(R.id.imageDrink)
        val titleDrink: TextView = itemView.findViewById(R.id.titleDrink)
        val descriptionDrink: TextView = itemView.findViewById(R.id.descriptionDrink)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DrinkViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_drink, parent, false)
        return DrinkViewHolder(view)
    }

    override fun getItemCount(): Int {
        return drinks.size
    }

    override fun onBindViewHolder(holder: DrinkViewHolder, position: Int) {
        val drink = drinks[position]

        holder.imageDrink.setImageResource(drink.imageDrink)
        holder.titleDrink.text = drink.nameDrink
        holder.descriptionDrink.text = drink.descriptionDrink
        holder.itemView.setOnClickListener {
            onClickItemDrink(drink)
        }
    }
}