package com.example.temadawm.model;

public class AmericaModel extends Animal{
    String nume;
    String continent;
    AmericaModel(String nume, String continent)
    {
        super(com.example.temadawm.model.continent.AMERICA);
        this.nume=nume;
        this.continent=continent;
    }
}
