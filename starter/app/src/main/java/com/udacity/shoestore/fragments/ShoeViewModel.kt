package com.udacity.shoestore.fragments

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeViewModel : ViewModel() {

    val shoeSize = MutableLiveData<String>()
    val shoeName = MutableLiveData<String>()
    val shoeDescription = MutableLiveData<String>()
    val shoeCompany = MutableLiveData<String>()

}