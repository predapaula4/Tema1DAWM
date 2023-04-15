package com.example.temadawm.model;
import com.example.temadawm.fragment.AnimalPage;
public class Animal {
    continent Continent;
    Animal(continent key)
    {
     this.Continent=key;
    }
    public continent getContinent(){
        return Continent;
    }

}
