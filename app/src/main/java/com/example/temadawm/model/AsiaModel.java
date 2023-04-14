package com.example.temadawm.model;

public class AsiaModel extends Animal{
    String nume;
    String continent;
    AsiaModel(String nume, String continent)
    {
        super(com.example.temadawm.model.continent.ASIA);
        this.nume=nume;
        this.continent=continent;
    }
}
