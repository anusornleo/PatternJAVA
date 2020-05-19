package com.company.observer;

import java.util.ArrayList;

public class DataMocup implements Observee {
    private ArrayList<Observer> observers;
    private int state;

    public DataMocup(){
        observers = new ArrayList();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf(observer);
        if(index > 0){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(state);
        }
    }

    public void setState(int state){
        this.state = state;
        notifyObserver();
    }
}
