package com.example.restaurantapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
class DrinksFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
       return inflater.inflate(R.layout.fragment_drinks, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val back : Button = view.findViewById(R.id.button_Back)
        back.setOnClickListener {
            val fragmentMain = MenuFragment()
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragmentMain)
                .addToBackStack(null)
                .commit()
        }
    }
}