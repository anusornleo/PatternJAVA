package com.company.adapter;

public class Iphone implements LightningPort {
    @Override
    public void charge() {
        System.out.println("Charge Iphone");
    }

    @Override
    public void useLightning() {
        System.out.println("Lightning Connected");
    }
}
