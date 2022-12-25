package com.udacity.shoestore.models

import androidx.lifecycle.MutableLiveData

class User  {

    val email = MutableLiveData<String>("")
    val password = MutableLiveData<String>("")
}