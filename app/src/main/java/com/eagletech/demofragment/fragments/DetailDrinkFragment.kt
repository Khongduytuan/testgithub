package com.eagletech.demofragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.eagletech.demofragment.R
import com.eagletech.demofragment.model.Drink


class DetailDrinkFragment : Fragment() {
    lateinit var imageDetailDrink: ImageView
    lateinit var detailTitleDrink: TextView
    lateinit var detailDescriptionDrink: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_drink, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val drink = arguments?.getSerializable("drink") as Drink

        imageDetailDrink = view.findViewById(R.id.imageDetailDrink)
        detailTitleDrink = view.findViewById(R.id.detailTitleDrink)
        detailDescriptionDrink = view.findViewById(R.id.detailDescriptionDrink)

        imageDetailDrink.setImageResource(drink.imageDrink)
        detailTitleDrink.text = drink.nameDrink
        detailDescriptionDrink.text = drink.descriptionDrink

    }


    // tạo 1 DetailDrinkFragment mới với 1 đối tượng drink
    companion object {
        fun newInstance(drink: Drink): DetailDrinkFragment {
            val fragment = DetailDrinkFragment()
            val args = Bundle()
            args.putSerializable("drink", drink)
            fragment.arguments = args
            return fragment
        }

    }


}