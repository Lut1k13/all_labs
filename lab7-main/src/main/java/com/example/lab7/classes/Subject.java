package com.example.lab7.classes;

import java.util.ArrayList;

public class Subject implements ISubject{
    private ArrayList<IObserver> observers= new ArrayList<IObserver>();
    @Override
    public void notifyAllObserver() {
        for (IObserver observer : observers) {
            observer.update(this);
        }
    }
    @Override
    public void attach(IObserver obs) {
        observers.add(obs);
    }
    @Override
    public void detach(IObserver obs) {
        observers.remove(obs);
    }
    public void tick() {
        notifyAllObserver();
    }
}
