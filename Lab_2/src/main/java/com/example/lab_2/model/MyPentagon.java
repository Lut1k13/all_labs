package com.example.lab_2.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyPentagon extends MyShape{

    double length;

    public MyPentagon(Color color, double x, double y, double length) {

        // calling Shape constructor

        super(color, x, y);

        this.length = length;


    }


    public MyPentagon() {

        // calling Shape constructor

        super(Color.RED, 200, 200);

        length = 40;


    }
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(this.color);
        gr.beginPath();
        // Make different Paths
        gr.setFill(Color.RED);
        gr.moveTo(x, y);
        gr.lineTo(x-length, y+length);
        gr.lineTo(x-length, y+length*2);
        gr.lineTo(x+length, y+length*2);
        gr.lineTo(x+length, y+length);
        gr.lineTo(x, y);
        gr.fill();
        // End the Path
        gr.closePath();

    }
}
