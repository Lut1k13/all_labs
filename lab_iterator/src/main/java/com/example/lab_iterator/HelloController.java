package com.example.lab_iterator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import com.example.lab_iterator.model.ConcrateIterator;
import com.example.lab_iterator.model.*;

import java.nio.file.Paths;


public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private ImageView view;
    public ImageCollection imgs =new ImageCollection("");
    public Iterator iter_main = imgs.getIterator();
    @FXML
    public void donwload(ActionEvent actionEvent) {
        view.setImage((Image)iter_main.next());

    }

    @FXML
    public void forward(ActionEvent actionEvent) {
    }
}