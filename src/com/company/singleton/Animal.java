package com.company.singleton;

public class Animal {
    //    3 instace private static NameClass
    private static Animal animalInstance;

    //    1. constructor must be private
    private Animal() {
    }

    //    2 method create only one object
    public static Animal getAnimalInstance() {
        if (animalInstance == null) {
            animalInstance = new Animal();
        }
        return animalInstance;
    }

    //    other method
    public void start() {
        System.out.println("Start");
    }

    public void stop() {
        System.out.println("Stop");
    }
}
