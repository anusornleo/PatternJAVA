package com.company;

import com.company.adapter.Iphone;
import com.company.adapter.Samsung;
import com.company.adapter.TypeC_ToLightning;
import com.company.adapter.dog_and_cat.Cat;
import com.company.adapter.dog_and_cat.CatAdapter;
import com.company.adapter.dog_and_cat.Dog;
import com.company.adapter.dog_and_cat.PersianCat;
import com.company.decorator.Coffee;
import com.company.decorator.OriginalCoffee;
import com.company.decorator.Sugar;
import com.company.facade.BedroomFacade;
import com.company.facade.Fan;
import com.company.facade.Light;
import com.company.factory.CakeFactory;
import com.company.factory.CakeStore;
import com.company.observer.DataMocup;
import com.company.observer.ShowDisplay;
import com.company.proxy.Image;
import com.company.proxy.ImageProxy;
import com.company.singleton.Animal;

public class Main {

    public static void main(String[] args) {

//        ### Singleton pattern ###
        Animal a = Animal.getAnimalInstance();
        a.start();
        a.stop();


//        ### Factory pattern ###
        CakeFactory cakeFactory = new CakeFactory(); //create Factory
        CakeStore cakeStore = new CakeStore(cakeFactory); //create store
        cakeStore.orderCake("vanila"); // order cake



//        ### Adapter pattern ###
        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();

        iphone.useLightning();
        iphone.charge();

        samsung.useType_C();
        samsung.charge();

        TypeC_ToLightning adapter = new TypeC_ToLightning(iphone);
        adapter.useType_C(); // output is lightning
        adapter.charge(); // charge iphone

        // *** DOG CAT CASE ***
        // normal case
//        Dog bangkaew = new BangKaewDog();

        // if BangKaewDog() Class was Remove!

        Cat persian = new PersianCat();
        Dog bangkaew = new CatAdapter(persian);

        // it can use bangkeaw instance in old code!!

        bangkaew.bark(); // print "Meow Meow"
        bangkaew.run(); // print "Cat run"




//        ###decorator pattern###
        Coffee coffee = new OriginalCoffee();
//
        coffee = new Sugar(coffee); // put suger in coffee
        coffee = new Sugar(coffee); // put suger in coffee more
        coffee = new Sugar(coffee); // put suger in coffee more
//
//        // conclusion price
        System.out.println("Cost : "+coffee.getCost()+" Ingredient : "+coffee.getIngredients());


//        ### Facade Pattern ###
        Light light = new Light();  //create Light
        Fan fan = new Fan();  // create Fan
        BedroomFacade bedroomFacade = new BedroomFacade(light, fan); // create room
        bedroomFacade.getToBed();
        bedroomFacade.wakeUp();


//        ### observer pattern ###
        DataMocup dataMocup = new DataMocup();
        ShowDisplay showDisplay = new ShowDisplay(dataMocup);
        dataMocup.setState(1); // show "State now is 1"



//        ### Proxy ###
        Image loadImage = new ImageProxy("leo");

        loadImage.showImage();



//        ### Test ###
//        testValue(factorial(3),6);
    }

//    public static void testValue(int test, int result){
//        if(test == result){
//            System.out.println("pass");
//        } else {
//            System.out.println("fail : result = "+test);
//        }
//    }
//
//    public static int multipleTwo(int number){
//        number *= 2;
//        return number;
//    }
//
//    public static int factorial(int n){
//        return (n <= 1) ? 1 : n*factorial(n-1);
//    }
}
