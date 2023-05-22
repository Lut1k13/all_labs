package com.example.lab_2.model;

import javafx.scene.shape.Shape;

import java.util.HashMap;

public class ShapeFactory implements IFactory {

    public MyShape createShape(int numberOfSides) {

        HashMap<Integer, MyShape> passportsAndNames = new HashMap<>();
        passportsAndNames.put(0, new MyCircle());
        passportsAndNames.put(1, new MyLine());
        passportsAndNames.put(2, new MyAngle());
        passportsAndNames.put(3, new MyTriangle());
        passportsAndNames.put(4, new MyRectangle());
        passportsAndNames.put(5, new MyPentagon());

        return passportsAndNames.get(numberOfSides);
    }
}
