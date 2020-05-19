package com.company.adapter.dog_and_cat;

public class BangKaewDog implements Dog {
    @Override
    public void bark() {
        System.out.println("Hong Hong!");
    }

    @Override
    public void run() {
        System.out.println("Run!");
    }
}
