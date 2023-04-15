package com.example.temadawm.model;

public enum continent {
    EUROPA(0),
    AFRICA(1),
    AUSTRALIA(2),
    AMERICA(3),
    ASIA(4);

    private final int key;

    continent(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}