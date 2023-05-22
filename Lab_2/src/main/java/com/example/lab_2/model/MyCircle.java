package com.example.lab_2.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCircle extends MyShape{

    private double length;
    private double width;

    public MyCircle(Color color, double x, double y, double length, double width)
    {
        super(color,x,y);
        this.length = length;
        this.width = width;

    }
    public MyCircle()
    {
        super(Color.RED, 210, 230);
        length = 150;
        width = 110;

    }
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(color);
        gr.fillOval(this.x, this.y, 50, 50);
    }
}
