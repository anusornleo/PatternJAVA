package com.company.decorator;

public class Sugar extends CoffeeDecoration {

    public Sugar(Coffee coffee){
        super(coffee);
    }

    public double getCost(){
        return super.getCost() + 5;
    }

    public String getIngredients(){
        return super.getIngredients() + ", Suger";
    }

}
