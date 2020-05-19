package com.company.observer;

public class ShowDisplay implements Observer,Display {
    private int state;
    private Observee dataMocup;

    public ShowDisplay(DataMocup dataMocup){
        this.dataMocup = dataMocup;
        dataMocup.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("State now is "+state);
    }

    @Override
    public void update(int state) {
        this.state = state;
        display();
    }
}
