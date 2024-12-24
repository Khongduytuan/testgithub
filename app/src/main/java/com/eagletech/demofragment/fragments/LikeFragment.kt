package com.eagletech.demofragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.eagletech.demofragment.R
import com.eagletech.demofragment.adapters.DrinkAdapter
import com.eagletech.demofragment.model.Drink


class LikeFragment : Fragment() {

    lateinit var recycleViewDrink: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_like, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycleViewDrink = view.findViewById(R.id.recycleViewDrink)
        val drinks = listOf(
            Drink(
                imageDrink = R.drawable.coffee,
                nameDrink = "Coffee",
                descriptionDrink = "Cà phê sữa đá Việt Nam"
            ),
            Drink(
                imageDrink = R.drawable.coffee,
                nameDrink = "Coffee1",
                descriptionDrink = "Cà phê sữa đá Việt Nam"
            ),
            Drink(
                imageDrink = R.drawable.coffee,
                nameDrink = "Coffee2",
                descriptionDrink = "Cà phê sữa đá Việt Nam"
            ),
            Drink(
                imageDrink = R.drawable.coffee,
                nameDrink = "Coffee3",
                descriptionDrink = "Cà phê sữa đá Việt Nam"
            ),
            Drink(
                imageDrink = R.drawable.coffee,
                nameDrink = "Coffee4",
                descriptionDrink = "Cà phê sữa đá Việt Nam"
            ),
            Drink(
                imageDrink = R.drawable.coffee,
                nameDrink = "Coffee5",
                descriptionDrink = "Cà phê sữa đá Việt Nam"
            ),
            Drink(
                imageDrink = R.drawable.coffee,
                nameDrink = "Coffee6",
                descriptionDrink = "Cà phê sữa đá Việt Nam"
            ),
            Drink(
                imageDrink = R.drawable.coffee,
                nameDrink = "Coffee7",
                descriptionDrink = "Cà phê sữa đá Việt Nam"
            ),
            Drink(
                imageDrink = R.drawable.coffee,
                nameDrink = "Coffee8",
                descriptionDrink = "Cà phê sữa đá Việt Nam"
            ),
            Drink(
                imageDrink = R.drawable.coffee,
                nameDrink = "Coffee9",
                descriptionDrink = "Cà phê sữa đá Việt Nam"
            ),


            )
        recycleViewDrink.layoutManager = LinearLayoutManager(requireContext())
        recycleViewDrink.adapter = DrinkAdapter(drinks) { drink ->
            // gửi dữ liệu từ một fragment sang một fragment
            Toast.makeText(requireContext(), drink.nameDrink, Toast.LENGTH_SHORT).show()
            openDetailDrinkFragment(drink)
        }
    }

    private fun openDetailDrinkFragment(drink: Drink) {
        val detailDrinkFragment = DetailDrinkFragment.newInstance(drink)
        parentFragmentManager.beginTransaction()
            .replace(R.id.frame_layout, detailDrinkFragment)
            .addToBackStack(null)
            .commit()
    }



}