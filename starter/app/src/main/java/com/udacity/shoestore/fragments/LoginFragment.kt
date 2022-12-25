package com.udacity.shoestore

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.models.User

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val binding: FragmentLoginBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login,
        container, false)


        binding.createNewButton.setOnClickListener { view: View ->
            Navigation.findNavController(view).navigate(R.id.action_loginFragment2_to_welcomeFragment)
        }

        binding.signInButton.setOnClickListener {   view: View ->
            Navigation.findNavController(view).navigate(R.id.action_loginFragment2_to_welcomeFragment)
        }

        return binding.root
    }

}