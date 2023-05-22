package com.example.dao;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTask{
        private List<Task> tasks;
        public ListTask(int size) {
            tasks = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < size; i++) {
                Task task = new Task(new SimpleIntegerProperty(i+1), randomTime(random), new SimpleStringProperty("Task " + (i + 1)), new SimpleStringProperty("Context for task " + (i + 1)));
                tasks.add(task);
            }

        }
        private SimpleStringProperty randomTime(Random random) {
            LocalDateTime dateTime = LocalDateTime.now();
            dateTime = dateTime.minusDays(random.nextInt(0,30));
            dateTime = dateTime.minusHours(random.nextInt(0,24));
            dateTime = dateTime.minusMonths(random.nextInt(0,20));
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            SimpleStringProperty formattedDateTime = new SimpleStringProperty(dateTime.format(dateTimeFormatter));
            System.out.println(formattedDateTime);
            return formattedDateTime;
        }

    public List<Task> getTasks() {
        return tasks;
    }
    public void Add(Task task)
    {
        tasks.add(task);
    }
}
