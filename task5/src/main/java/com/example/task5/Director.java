package com.example.task5;

import javafx.scene.layout.Pane;

public class Director {
    public Indicator construct(Builder builder, Pane pane) {
        builder = new BuilderIndicatorMini();
        builder.lineBounds(22.2f, 26.1f);
        builder.linePaint(22.4f);
        builder.lineMark( 22.4f);
        builder.addTitle("Норма");
        Indicator indicator = builder.build();
        indicator.show(pane);
        return indicator;
    }
}
