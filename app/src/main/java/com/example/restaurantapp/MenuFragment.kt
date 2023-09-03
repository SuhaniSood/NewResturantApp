package com.example.restaurantapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__menu, container, false)

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mainCoursebutton : Button = view.findViewById(R.id.button_MainCourse)
        mainCoursebutton.setOnClickListener {
            val fragmentMain = MainCourseFragment()

            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragmentMain)
                .addToBackStack(null)
                .commit()
        }
        val drinksbutton : Button = view.findViewById(R.id.button_Drinks)
        drinksbutton.setOnClickListener {
            val fragmentMain = DrinksFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragmentMain)
                .addToBackStack(null)
                .commit()
        }
        val dessertsbutton : Button = view.findViewById(R.id.button_Desserts)
        dessertsbutton.setOnClickListener {
            val fragmentMain = DessertsFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragmentMain)
                .addToBackStack(null)
                .commit()
        }
        val Specialbutton : Button = view.findViewById(R.id.button_Specials)
        Specialbutton.setOnClickListener {
            val fragmentMain = SpecialsFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragmentMain)
                .addToBackStack(null)
                .commit()
        }

    }

}