package com.example.dao;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDateTime;

public class Task {
    private SimpleIntegerProperty id;
    private SimpleStringProperty dataTime;
    private SimpleStringProperty target;
    private SimpleStringProperty comment;

    public Task(SimpleIntegerProperty id, SimpleStringProperty dataTime, SimpleStringProperty target, SimpleStringProperty comment) {
        this.id = id;
        this.dataTime = dataTime;
        this.target = target;
        this.comment = comment;
    }

    public int getId() {
        return id.get();
    }

    public SimpleIntegerProperty idProperty() {
        return id;
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getDataTime() {
        return dataTime.get();
    }

    public SimpleStringProperty dataTimeProperty() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime.set(dataTime);
    }

    public String getTarget() {
        return target.get();
    }

    public SimpleStringProperty targetProperty() {
        return target;
    }

    public void setTarget(String target) {
        this.target.set(target);
    }

    public String getComment() {
        return comment.get();
    }

    public SimpleStringProperty commentProperty() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment.set(comment);
    }
}
