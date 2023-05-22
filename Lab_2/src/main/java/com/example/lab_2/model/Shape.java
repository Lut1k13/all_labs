package com.example.lab_2.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
abstract class Shape  {

    //параметры фигуры - приватные поля

    protected Color color;

    protected double x, y;

    abstract void draw(GraphicsContext gr);
    // объявление абстрактных методов



    // конструктор
    public Shape(Color color, double x, double y) {
      this.x = x;
      this.y = y;
      this.color = color;
    }

    // реализация методов

    public void setColor(Color color) {

        this.color=color;     }

    public Color getColor() {
        return color;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

