package com.example.temadawm.model

import com.example.temadawm.model.Animal
import com.example.temadawm.model.Continent

data class EuropeModel(val name:String, val region:String): Animal(Continent.EUROPE) {
}