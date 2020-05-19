package com.company.factory;

public class CakeStore {
    CakeFactory cakeFactory;
    public CakeStore(CakeFactory cakeFactory){
        this.cakeFactory = cakeFactory;
    }

    public Cake orderCake(String type){
        Cake cake;
        cake = cakeFactory.crateCake(type);
        cake.bake();
        cake.cut();
        return cake;
    }
}
