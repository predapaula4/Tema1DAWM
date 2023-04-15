package com.example.temadawm.model;

public class EuropeModel extends Animal{
    String nume;
    String continent;
    public EuropeModel(String nume, String continent)
    {
        super(com.example.temadawm.model.continent.EUROPA);
        this.nume=nume;
        this.continent=continent;
    }
    public String getNume()
    {
        return nume;
    }
}
