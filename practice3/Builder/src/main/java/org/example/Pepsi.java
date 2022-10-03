package org.example;

public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 10.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
