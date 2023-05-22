package com.example.task5;

import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class Indicator {
    private Pane panel = new Pane();

    public Pane getPanel() {
        return panel;
    }
    public Indicator()
    {}
    public  Indicator(IndicatorBuilder builder)
    {
        add(builder.parent);
    }
    public void add(Pane pane){
        panel.getChildren().add(pane);
    }

    public void show(Pane pane){
        pane.getChildren().add(panel);
    }

    public void setLenght(int n) {

    }

    public void setPaint(char norm) {
    }

    public void setMetka(char select) {
    }
    public static class IndicatorBuilder
    {
        private float start, stop;
        private int ktemp=0;
        Pane parent =new Pane();


        public IndicatorBuilder lineBounds(float start, float stop) {
            this.start=start;
            this.stop=stop;
            FlowPane pane = new FlowPane();
            Text text = new Text (""+start);
            Line line = new Line();
            line.setStartX(5);
            line.setStartY(5);
            line.setEndX(100);
            line.setEndY(5);
            Text text1 = new Text (""+stop);
            pane.getChildren().add(text);
            pane.getChildren().add(line);
            pane.getChildren().add(text1);
            pane.setLayoutY(20);
            parent.getChildren().add(pane);
            return this;
        }

        public IndicatorBuilder linePaint(float mesuare) {
            Pane pane =new Pane();
            Text startText = new Text(String.valueOf(start));
            double x =startText.getLayoutBounds().getWidth()+(mesuare-start)/(stop-start)*95;
            Line left =new Line();
            left.setEndX(x);
            left.setEndY(25);
            left.setStartX(x-3);
            left.setStartY(15);
            Line right =new Line();
            right.setEndX(x);
            right.setEndY(25);
            right.setStartX(x+3);
            right.setStartY(15);
            pane.getChildren().addAll(left,right);
            parent.getChildren().add(pane);
            return this;
        }

        public IndicatorBuilder lineMark(float mesuare) {
            Pane pane =new Pane();
            Text startText = new Text(String.valueOf(start));
            double x =startText.getLayoutBounds().getWidth()+(mesuare-start)/(stop-start)*95;
            Text text = new Text(String.valueOf(mesuare));
            text.setX(x-10);
            text.setY(45);
            pane.getChildren().addAll(text);
            parent.getChildren().add(pane);
            return this;
        }

        public IndicatorBuilder addTitle(String name) {
            Pane pane = new Pane();
            Text title = new Text(name);
            title.setX(50);
            title.setY(10);
            pane.getChildren().add(title);
            parent.getChildren().add(pane);
            return this;
        }

        public Indicator build() {
            return new Indicator(this);
        }
    }
}
