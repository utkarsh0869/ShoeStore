package com.udacity.shoestore

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.udacity.shoestore.databinding.FragmentShoeListBinding

class ShoeList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(inflater,
        R.layout.fragment_shoe_list, container, false)

        val viewModel : ShoeListViewModel by activityViewModels()

        viewModel.shoes.observe(viewLifecycleOwner, Observer { it ->

            it.forEach{

                val shoeDescription0 = TextView(context)
                shoeDescription0.layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
                shoeDescription0.text = "SHOE DESCRIPTION"
                shoeDescription0.textSize = 20F
                shoeDescription0.setTextColor(Color.GREEN)
                val shoeDescription = TextView(context)
                shoeDescription.layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
                shoeDescription.text = it.description
                shoeDescription.textSize = 20F

                val shoeSize0 = TextView(context)
                shoeSize0.layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
                shoeSize0.text = "SHOE SIZE"
                shoeSize0.textSize = 20F
                shoeSize0.setTextColor(Color.GREEN)
                val shoeSize = TextView(context)
                shoeSize.layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
                shoeSize.text = it.size
                shoeSize.textSize = 20F

                val shoeCompany0 = TextView(context)
                shoeCompany0.layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
                shoeCompany0.text = "SHOE COMPANY"
                shoeCompany0.textSize = 20F
                shoeCompany0.setTextColor(Color.GREEN)
                val shoeCompany = TextView(context)
                shoeCompany.layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
                shoeCompany.text = it.company
                shoeCompany.textSize = 20F

                val shoeName0 = TextView(context)
                shoeName0.layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
                shoeName0.text = "SHOE NAME"
                shoeName0.textSize = 20F
                shoeName0.setTextColor(Color.GREEN)
                val shoeName = TextView(context)
                shoeName.layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
                shoeName.text = it.name
                shoeName.textSize = 20F

                binding.linearLayout?.addView(shoeDescription0)
                binding.linearLayout?.addView(shoeDescription)

                binding.linearLayout?.addView(shoeSize0)
                binding.linearLayout?.addView(shoeSize)

                binding.linearLayout?.addView(shoeCompany0)
                binding.linearLayout?.addView(shoeCompany)

                binding.linearLayout?.addView(shoeName0)
                binding.linearLayout?.addView(shoeName)
            }
        })

        binding.logoutButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoeList_to_loginFragment2)
        )

        binding.fab.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoeList_to_fragment_shoe_details)
        )

        return binding.root
    }


}