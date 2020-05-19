package com.company.decorator;

public class CoffeeDecoration implements Coffee {

    private final Coffee coffee;
    private String ingredient = ", ";

    public CoffeeDecoration(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients();
    }
}
