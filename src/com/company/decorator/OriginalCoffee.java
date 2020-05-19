package com.company.decorator;

public class OriginalCoffee implements Coffee {
    @Override
    public double getCost() {
        return 20;
    }

    @Override
    public String getIngredients() {
        return "OriginalCoffee";
    }
}
