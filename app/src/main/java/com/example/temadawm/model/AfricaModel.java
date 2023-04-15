package com.example.temadawm.model;

public class AfricaModel extends Animal{
    String nume;
    String continent;
    public AfricaModel(String nume, String continent)
    {
        super(com.example.temadawm.model.continent.AFRICA);
        this.nume=nume;
        this.continent=continent;
    }
    public String getNume()
    {
        return nume;
    }

}
