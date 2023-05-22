package com.example.lab_2.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyLine extends MyShape{

    private double x_end;

    private double y_end;

    public MyLine(Color color, double x, double y, double x_end, double y_end) {

        // calling Shape constructor

        super(color, x, y, "Линия");

        this.x_end = x_end;

        this.y_end = y_end;
    }


    public MyLine() {
        super(Color.RED, 104, 140, "Линия");
        x_end = 300;
        y_end = 300;
    }
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(this.color);
        gr.strokeLine(this.x, this.y, x_end, y_end);
    }

    @Override
    public String toString() {
        return "Линия";
    }
}
