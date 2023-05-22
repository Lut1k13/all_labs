package com.example.lab7.classes;

public interface ISubject {
    public void notifyAllObserver();//уведомить
    public void attach(IObserver obs);//добавить слушателя
    public void detach(IObserver obs);//удалить слушателя
}
