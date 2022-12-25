package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.udacity.shoestore.databinding.FragmentInstructionsBinding

/**
 * A simple [Fragment] subclass.
 * Use the [InstructionsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InstructionsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding: FragmentInstructionsBinding = DataBindingUtil.inflate(inflater,
        R.layout.fragment_instructions, container, false)

        binding.shoeListButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_instructionsFragment_to_shoeList)
        )

        return binding.root
    }

}