package com.eagletech.demofragment.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eagletech.demofragment.R
import com.eagletech.demofragment.activities.DetailFoodActivity
import com.eagletech.demofragment.adapters.FoodAdapter
import com.eagletech.demofragment.model.Food


class HomeFragment : Fragment() {
    lateinit var recycleViewFood: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycleViewFood = view.findViewById(R.id.recycleViewFood)

        val listFood = listOf(
            Food(
                imageRes = R.drawable.beef_stew,
                title = "Beef Stew",
                description = "Delicious spaghetti recipe Delicious spaghetti recipe Delicious spaghetti recipe"
            ),
            Food(
                imageRes = R.drawable.caesar_salad,
                title = "Caesar Salad",
                description = "Delicious spaghetti recipe Delicious spaghetti recipe Delicious spaghetti recipe"
            ),
            Food(
                imageRes = R.drawable.chicken_curry,
                title = "Chicken Curry",
                description = "Delicious spaghetti recipe Delicious spaghetti recipe Delicious spaghetti recipe"
            ),
            Food(
                imageRes = R.drawable.chocolate_cake,
                title = "Chocolate Cake",
                description = "Delicious spaghetti recipe Delicious spaghetti recipe Delicious spaghetti recipe"
            ),
            Food(
                imageRes = R.drawable.coffee,
                title = "Coffee",
                description = "Delicious spaghetti recipe Delicious spaghetti recipe Delicious spaghetti recipe"
            ),
            Food(
                imageRes = R.drawable.grilled_cheese,
                title = "Grilled Cheese",
                description = "Delicious spaghetti recipe Delicious spaghetti recipe Delicious spaghetti recipe"
            )
        )

        recycleViewFood.layoutManager = LinearLayoutManager(requireContext())
        recycleViewFood.adapter = FoodAdapter(listFood) { food ->
            // gửi dữ liệu từ một fragment sang một activity
            Toast.makeText(requireContext(), food.title, Toast.LENGTH_SHORT).show()

            val intent = Intent(requireContext(), DetailFoodActivity::class.java)
            intent.putExtra("food", food)
            startActivity(intent)
        }

    }


}