package com.company.adapter;

public class Samsung implements Type_C_Port{
    @Override
    public void charge() {
        System.out.println("charge Samsung");
    }

    @Override
    public void useType_C() {
        System.out.println("Type C Connected");
    }
}
