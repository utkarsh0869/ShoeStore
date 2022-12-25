package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.navigation.Navigation
import com.udacity.shoestore.databinding.FragmentShoeDetailsBinding
import com.udacity.shoestore.models.Shoe

class ShoeDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailsBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_shoe_details, container, false)

        val viewModel: ShoeListViewModel by activityViewModels()

            binding.addNewButton.setOnClickListener {
                val s = Shoe(binding.shoeName.text.toString(),
                                binding.shoeSize.text.toString(),
                                    binding.shoeCompany.text.toString(),
                                        binding.shoeDescription.text.toString())

                viewModel.addShoeToTheList(s)
                Toast.makeText(context, "Shoe Successfully Added", Toast.LENGTH_SHORT).show()

            }

        binding.saveButton.setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.action_shoeDetails_to_shoeList)
        )

        binding.cancelButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_shoeDetails_to_shoeList)

        )

        return binding.root
    }

}