package com.example.lab_iterator.model;

import javafx.scene.image.Image;

import java.nio.file.Paths;

public class ImageCollection implements Aggregate {
    private String filetopic;
    private Image bi;
    public ImageCollection(String filetopic) {
        this.filetopic = filetopic;
    }
    public class ImageIterator implements Iterator {
        private int current=0;
        @Override
        public boolean hasNext() {
            String filename = Paths.get("C:\\Users\\rusla\\OneDrive\\Рабочий стол\\лабы\\lab_iterator\\src\\main\\resources\\com\\example\\lab_iterator\\image" + filetopic + (current + 1) + ".jpg").toUri().toString();
            try {
                System.out.println(filename);
                bi = new Image(filename);
                return !bi.isError();
            } catch (Exception ex) {
                System.err.println("Не удалось загрузить картинку! " + filename);
                ex.printStackTrace();
                return false;
            }
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                current++;
                return bi;
            }
            else
            {
                Image Error = new Image("C:\\Users\\rusla\\OneDrive\\Рабочий стол\\лабы\\lab_iterator\\src\\main\\resources\\com\\example\\lab_iterator\\http-error-404-not-found.png");
                return Error;
            }

        }
    }
    @Override
    public Iterator getIterator() {
        return new ImageIterator();
    }

}
