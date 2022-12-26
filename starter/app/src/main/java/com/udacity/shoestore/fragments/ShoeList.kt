package com.udacity.shoestore

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
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
                shoeDescription.text = it.shoeDescription.toString()
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
                shoeSize.text = it.shoeSize.toString()
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
                shoeCompany.text = it.companyName.toString()
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
                shoeName.text = it.shoeName.toString()
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


        binding.fab.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoeList_to_fragment_shoe_details)
        )

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.overflow_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }


}