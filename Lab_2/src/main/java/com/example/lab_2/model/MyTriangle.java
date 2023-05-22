package com.example.lab_2.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

import java.io.Console;

public class MyTriangle extends MyShape {
    private double xPoints[];
    private double yPoints[];
    public MyTriangle(Color color, double x, double y) {
        super(color, x, y);
    }

    public MyTriangle()
    {
        super(Color.RED, 200, 200);
        xPoints = new double[]{x, 300.0, 100.0};
        yPoints = new double[]{y, 300.0, 300.0};
    }


    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(this.color);
        gr.fillPolygon(xPoints, yPoints, 3);
    }
}
