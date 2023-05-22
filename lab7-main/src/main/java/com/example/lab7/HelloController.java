package com.example.lab7;

import com.example.lab7.classes.Observer;
import com.example.lab7.classes.Subject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
public class HelloController {
    public Button tick;
    @FXML
    private Label welcomeText;

    Subject subject = new Subject();
    @FXML
    protected void onHelloButtonClick() {

        subject.attach(new Observer("Server 2"));
        subject.attach(new Observer("Server 3"));

    }

    public void Tick(ActionEvent event) {
        subject.tick();

    }
}
