package com.company.facade;

public class BedroomFacade {
    private final Light light;
    private final Fan fan;

    public BedroomFacade(Light light,Fan fan){
        this.light = light;
        this.fan = fan;
    }

    public void getToBed(){
        light.off();
        fan.on();
    }

    public void wakeUp(){
        light.on();
        fan.off();
    }
}
