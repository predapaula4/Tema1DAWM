package com.example.temadawm.model;

public class AustraliaModel extends Animal{
    String nume;
    String continent;
    AustraliaModel(String nume, String continent)
    {
        super(com.example.temadawm.model.continent.AUSTRALIA);
        this.nume=nume;
        this.continent=continent;
    }
}
