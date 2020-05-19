package com.company.adapter.dog_and_cat;

public class PersianCat implements Cat {
    @Override
    public void meow() {
        System.out.println("Meow Meow");
    }

    @Override
    public void run() {
        System.out.println("Cat Run!");
    }
}
