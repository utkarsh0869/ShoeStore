package com.udacity.shoestore.models

import androidx.lifecycle.MutableLiveData

class Shoe {
    var shoeSize : String = ""
    var companyName : String = ""
    var shoeDescription : String = ""
    var shoeName : String = ""

    constructor(shoeName: String,
                    shoeSize: String,
                        shoeCompany: String,
                            shoeDescription: String){
        this.shoeSize = shoeSize
        this.companyName = shoeCompany
        this.shoeDescription = shoeDescription
        this.shoeName = shoeName
    }


}