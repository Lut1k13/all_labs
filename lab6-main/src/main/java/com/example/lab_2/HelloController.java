package com.example.lab_2;

import com.example.lab_2.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    public ListView list;

    public ColorPicker color;
    @FXML
    private Canvas canvas;
    @FXML
    private TextField value1;
    public ObservableList<MyShape> figs;
    private GraphicsContext gr;


    public void drawShape(ActionEvent actionEvent) {
        ShapeFactory shapeFactory = new ShapeFactory();
        gr = canvas.getGraphicsContext2D();

        HashMap<String, Integer> nameAndNames = new HashMap<>();
        nameAndNames.put( "Круг", 0);
        nameAndNames.put( "Линия",1);
        nameAndNames.put( "Угол",2);
        nameAndNames.put( "Треугольник",3);
        nameAndNames.put( "Квадрат",4);
        nameAndNames.put( "Многоугольгик",5);

        int numberOfSides;
        String str = value1.getText();
        try {
            numberOfSides = Integer.parseInt(str);

        } catch (NumberFormatException e) {
            numberOfSides = nameAndNames.get(str);
        }
        gr.clearRect(0, 0, 800, 600);
        MyShape shape1 = shapeFactory.createShape(numberOfSides);
        shape1.setColor(color.getValue());

        shape1.draw(gr);
        }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        figs = FXCollections.observableArrayList();
        figs.add(new MyTriangle());
        figs.add(new MyAngle());
        figs.add(new MyCircle());
        figs.add(new MyRectangle());
        list.setItems(figs);
        gr = canvas.getGraphicsContext2D();
    }

    public void addShape(MouseEvent mouseEvent) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        list.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int a = list.getSelectionModel().getSelectedIndex();
        MyShape new_fig = figs.get(a);
        new_fig.setColor(color.getValue());
        gr.clearRect(0, 0, 800, 600);
        new_fig.draw(gc);
    }
}
