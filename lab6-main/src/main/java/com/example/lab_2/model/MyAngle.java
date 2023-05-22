package com.example.lab_2.model;
import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyAngle extends MyShape{

    private double length;

    public MyAngle(Color color, double x, double y, double x_end, double y_end, double length) {

        super(color, x, y, "Угол");
        this.length = length;
    }


    public MyAngle() {
        // calling Shape constructor
        super(Color.RED, 154, 154, "Угол");
        length = 100;
    }
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(this.color);
        gr.strokeLine(x, y, x + length * Math.cos(Math.PI / 4), y + length * Math.sin(Math.PI / 4));
        gr.strokeLine(x, y, x + length * Math.cos(3 * Math.PI / 4), y + length * Math.sin(3 * Math.PI / 4));
    }

    @Override
    public String toString() {
        return "Угол";
    }
}
