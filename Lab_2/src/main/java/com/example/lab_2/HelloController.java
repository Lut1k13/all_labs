package com.example.lab_2;
import com.example.lab_2.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;



public class HelloController {
    @FXML
    public Button buttonDraw;
    @FXML
    private Label welcomeText;
    @FXML
    private Canvas canvas;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private Label label;
    @FXML
    private Label label1;
    @FXML
    private Button drawButton;

    @FXML
    private TextField value1;
    private double x, y;

    private double distance_X;
    private double  distance_Y;
    private Boolean flag_rect;
    private Boolean flag_circle;




    @FXML
    protected  void drawButton() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
/*
        // установка толщины линии
        gc.setLineWidth(2.0);

        // установка цвета
        gc.setFill(Color.RED);

        // рисование скругленного прямоугольника
        gc.strokeRoundRect(10, 10, 50, 50, 10, 10);

        // закрашивание скругленного прямоугольника
        gc.fillRoundRect(100, 10, 50, 50, 10, 10);

        // установка цвета заполнения
        gc.setFill(Color.BLUE);

        // рисование овала
        gc.strokeOval(10, 70, 50, 30);

        // закрашивание овала
        gc.fillOval(100, 70, 50, 30);

        // рисование линии
        gc.strokeLine(200, 50, 300, 50);

        // рисование дуги
        gc.strokeArc(320, 10, 50, 50, 40, 80, ArcType.ROUND);

        // закрашивание дуги
        gc.fillArc(320, 70, 50, 50, 00, 120, ArcType.OPEN); */
/*
        // установка толщины линии
        gc.setLineWidth(2.0);

        // установка цвета
        gc.setFill(Color.RED);

        // рисование скругленного прямоугольника
        gc.strokeRoundRect(10, 10, 50, 50, 10, 10);

        // закрашивание скругленного прямоугольника
        gc.fillRoundRect(10, 10, 50, 50, 10, 10);
*/
        // установка цвета
        gc.setFill(Color.BLUE);

        // рисование скругленного прямоугольника
//        gc.strokeRoundRect(60, 10, 50, 50, 10, 10);

        // закрашивание скругленного прямоугольника
    //    gc.fillRoundRect(60, 10, 50, 50, 10, 10);
        // Start the Path
        gc.beginPath();
        // Make different Paths
        gc.setFill(Color.BLUE);
        gc.moveTo(50, 50);
       gc.lineTo(25, 75);
        gc.lineTo(25, 110);
        gc.lineTo(75, 110);
        gc.lineTo(75, 75);

        gc.setFill(Color.RED);
        gc.moveTo(150, 50);
        gc.lineTo(125, 75);
        gc.lineTo(125, 110);
        gc.lineTo(175, 110);
        gc.lineTo(175, 75);

        gc.moveTo(150, 150);
        gc.lineTo(125, 175);
        gc.lineTo(125, 210);
        gc.lineTo(175, 210);
        gc.lineTo(175, 175);
        gc.fill();
        // End the Path
        gc.closePath();


        /*
        // рисование овала
        gc.strokeOval(10, 70, 50, 30);
        // закрашивание овала
        gc.fillOval(100, 70, 50, 30);
        Path path; // класс Path описывает траекторию движения шара i в круге
        for (int i = 0; i < 10; i++)
        {
        int paired; // для каждого круга определим, на место круга с каким индексом он движется

        if (i % 2 == 0) { // четные кружки движутся от центра сцены, нечетные - к центру

            paired = (i + 3) % 24;
            double angle = Math.PI / 6 + i * 2 * Math.PI / 24;
            path = new Path( // описание "внешней" траектории с помощью квадратичной кривой Безье

                    new MoveTo(getX(i), getY(i)),

                    new QuadCurveTo(250 + Math.cos(angle) * 265, 250 + Math.sin(angle) * 265, getX(paired), getY(paired))

            );

        } else {

            paired = (i - 3 + 24) % 24;

            path = new Path( // описание "внутренней" траектории с помощью дуги

                    new MoveTo(getX(i), getY(i)),

                    new ArcTo(1, 1, 0, getX(paired), getY(paired), true, true)

            );
        }

        }
        */
    }

    public void drawRectangle(ActionEvent actionEvent) {
        flag_circle =false;
     flag_rect = true;
    }


    public void drawCircle(ActionEvent actionEvent) {
        flag_rect = false;
        flag_circle = true;
    }

    public void draw_circle()
    {
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        MyCircle myCircle = new MyCircle(colorPicker.getValue(), x, y, distance_X, distance_Y);
        myCircle.draw(graphicsContext);
    }
    public void draw_rect()
    {
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        MyRectangle myRectangle = new MyRectangle(colorPicker.getValue(), x, y, distance_X, distance_Y);
        myRectangle.draw(graphicsContext);
    }
    public void drawTriangle(ActionEvent actionEvent) {
    }

    public void showCoordinate(MouseEvent mouseEvent) {
        String x_str = String.valueOf(mouseEvent.getX());
        x = mouseEvent.getX();
        y = mouseEvent.getY();
        String y_str = String.valueOf(mouseEvent.getY());
        label.setText("X= "+x_str+" "+"Y= "+y_str);
    }

    public void calculateSize(MouseEvent mouseEvent) {
        double new_x = mouseEvent.getX();
        double new_y = mouseEvent.getY();
        distance_X = new_x - x;
        distance_Y = new_y - y;
        String x_str = String.valueOf(mouseEvent.getY());
        String y_str = String.valueOf(mouseEvent.getY());
        label1.setText("X= "+x_str+" "+"Y= "+ y_str);
        if(flag_rect)
        {
         draw_rect();
        }
        else
        {
            if(flag_circle)
            {
                draw_circle();

            }
            else
            {
                label1.setText("Выбери фигуру!");
            }
        }


    }



    public void drawShape(ActionEvent actionEvent) {
        GraphicsContext gr = canvas.getGraphicsContext2D();
        if( value1.getText().equals("")){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Предупреждение: ");
        alert.setHeaderText(null);
        alert.setContentText("Введено нечисло или число не из диапазона от 0 до 5!");
        alert.showAndWait();
        return;
    }else {
        int numberOfSides = Integer.parseInt(value1.getText());
        ShapeFactory shapeFactory = new ShapeFactory();
        MyShape shape1 = shapeFactory.createShape(numberOfSides);
        gr.clearRect(0, 0, 800, 600);
        shape1.draw(gr);
    }
}
    }