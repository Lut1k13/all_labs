package com.example.lab_2.model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyRectangle extends MyShape{

        private double length;

        private double width;

        public MyRectangle(Color color,  double x, double y, double length, double width) {

            // calling Shape constructor

            super(color, x, y, "прямоугольгик");

            this.length = length;

            this.width = width;
        }


    public MyRectangle() {

        // calling Shape constructor

        super(Color.RED, 100, 200, "прямоугольгик");

        length = 80;

        width = 90;
    }
    @Override
    public void draw(GraphicsContext gr) {
            gr.setFill(this.color);
            gr.fillRect(this.x, this.y, length, width);

    }

    @Override
    public String toString() {
        return "Прямоуг";
    }
}

