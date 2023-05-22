package com.example.task5;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    public FlowPane pane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Builder builder = new BuilderIndicatorMini();
        Director director = new Director ();
        Indicator indicator = builder.build();
        indicator = director.construct(builder,pane);
        construct("Период",LocalDate.of(2022,11,12),LocalDate.of(2023,1,3),LocalDate.of(2022,11,15));
        construct("Материалы",12,56,33);
        //использование bloch builder
        Indicator indicator1 = new Indicator.IndicatorBuilder().addTitle("Индикатор").lineBounds(11f,44.4f).lineMark(33f).linePaint(33f).build();
        indicator1.show(pane);
    }
    //метод для создания индикатора с датой
    private void construct(String title, LocalDate start, LocalDate stop, LocalDate measure)
    {
        BuilderIndicatorDate builderIndicatorDate = new BuilderIndicatorDate();
        builderIndicatorDate.addTitle(title);
        builderIndicatorDate.lineBounds(start,stop);
        builderIndicatorDate.linePaint(measure);
        builderIndicatorDate.lineMark(measure);
        Indicator indicatorDate = builderIndicatorDate.build();
        indicatorDate.show(pane);
    }
    //метод для создания индикатора с целыми числами
    private void construct(String title, int start, int stop, int measure)
    {
        BuilderIndicatorInt builder = new BuilderIndicatorInt();
        builder.addTitle(title);
        builder.lineBounds(start,stop);
        builder.linePaint(measure);
        builder.lineMark(measure);
        Indicator indicatorDate = builder.build();
        indicatorDate.show(pane);
    }
}