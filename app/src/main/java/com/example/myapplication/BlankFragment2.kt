package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toolbar
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn=view.findViewById<Button>(R.id.ahihi)
        val tvname=view.findViewById<EditText>(R.id.tvNameProduct)
        val gia=view.findViewById<EditText>(R.id.tvCost_m2)
        btn.setOnClickListener {
            val wishList=WishList(System.currentTimeMillis().toInt(),tvname.text.toString(),gia.text.toString().toDouble())
            val bundle=Bundle().apply {
                putParcelable("ahihi",wishList)
            }
            Navigation.findNavController(view).navigate(R.id.blankFragment1,bundle)
        }
    }
}


