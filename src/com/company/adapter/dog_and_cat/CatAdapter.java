package com.company.adapter.dog_and_cat;

public class CatAdapter implements Dog {

    Cat cat;

    public CatAdapter(Cat cat){
        this.cat = cat;
    }

    @Override
    public void bark() {
        cat.meow();
    }

    @Override
    public void run() {
        cat.run();
    }
}
