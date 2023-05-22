package com.example.lab_2.model;

public class ShapeFactory implements IFactory {
    public MyShape createShape(int numberOfSides) {
        if (numberOfSides == 5) {
            return new MyPentagon();
        } else if (numberOfSides == 4) {
            return new MyRectangle();
        } else if (numberOfSides == 3) {
            return new MyTriangle();
        } else if (numberOfSides == 2) {
            return new MyAngle();
        } else if (numberOfSides == 1) {
            return new MyLine();
        } else if (numberOfSides == 0) {
            return new MyCircle();
        }
        return null;
    }
}
