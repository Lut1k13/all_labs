package com.example.dao;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public TextField time_field;
    public TextField target_field;
    public TextField comment_fild;
    @FXML
    private Label welcomeText;
    @FXML
    private TableView table;
    @FXML
    TableColumn сol0, col1, col2,col3;
    ListTask listTask;
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void Update(ActionEvent actionEvent) {
        table.getColumns().clear();

        for(int i = 0; i < listTask.getTasks().size(); i++)
        {
            System.out.println(listTask.getTasks().get(i).getTarget());
        }

        сol0.setMinWidth(15);//ширина
        сol0.setCellValueFactory(new PropertyValueFactory<Task, Integer>("id"));
        col1.setMinWidth(60);//ширина
        col1.setCellValueFactory(new PropertyValueFactory<Task, String>("dataTime"));
        col2.setMinWidth(60);//ширина
        col2.setCellValueFactory(new PropertyValueFactory<Task, String>("target"));
        col3.setMinWidth(60);//ширина
        col3.setCellValueFactory(new PropertyValueFactory<Task, String>("comment"));
        table.getColumns().add(сol0);
        table.getColumns().add(col1);
        table.getColumns().add(col2);
        table.getColumns().add(col3);
        ObservableList<Task> observableListTask = FXCollections.observableList(listTask.getTasks());
        table.setItems(observableListTask);
    }

    public void Next(ActionEvent actionEvent) {
    }

    public void Previos(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listTask = new ListTask(10);
        сol0 = new TableColumn("id");
        col1 = new TableColumn("Дата/Время");
        col2 = new TableColumn("Цель");
        col3 = new TableColumn("Комментарий");
        table.setEditable(true);

        col1.setCellFactory(TextFieldTableCell.forTableColumn());
        col1.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Task, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Task, String> t) {
                        ((Task) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setDataTime(t.getNewValue());
                    }
                }
        );

        col2.setCellFactory(TextFieldTableCell.forTableColumn());
        col2.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Task, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Task, String> t) {
                        ((Task) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setTarget(t.getNewValue());
                    }
                }
        );


        col3.setCellFactory(TextFieldTableCell.forTableColumn());
        col3.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<Task, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<Task, String> t) {
                        ((Task) t.getTableView().getItems().get(
                                t.getTablePosition().getRow())
                        ).setComment(t.getNewValue());
                    }
                }
        );

    }

    public void Add(ActionEvent actionEvent) {
        Task task = new Task(new SimpleIntegerProperty(listTask.getTasks().size()+1), new SimpleStringProperty(time_field.getText()), new SimpleStringProperty(target_field.getText()), new SimpleStringProperty(comment_fild.getText()));
        listTask.Add(task);
    }
}