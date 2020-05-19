package com.company.factory;

public class CakeFactory {
    public Cake crateCake(String type){
        Cake cake;
        if(type.equals("vanila")){
            cake = new VanilaCake();
        } else {
            cake = new VanilaCake();
        }
        return cake;
    }
}
