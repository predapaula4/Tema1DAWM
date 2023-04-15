package com.example.temadawm.model;

public class AsiaModel extends Animal{
    String nume;
    String continent;
    public AsiaModel(String nume, String continent)
    {
        super(com.example.temadawm.model.continent.ASIA);
        this.nume=nume;
        this.continent=continent;
    }
    public String getNume()
    {
        return nume;
    }
}
