package com.example.task5;

public interface Builder {
    public void setView(int N, char norm, char select);

    public void lineBounds(float start, float stop);

    public void linePaint(float mesuare);

    public void lineMark(float mesuare);

    public void addTitle(String name);

    public Indicator build();
}
