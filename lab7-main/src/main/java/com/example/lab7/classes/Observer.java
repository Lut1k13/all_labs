package com.example.lab7.classes;

public class Observer implements IObserver{

    private String name;
    public Observer(String name, Subject subject) {
        this.name = name;
        subject.attach(this);
    }

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(subject + "||" + this.name);
    }
}
