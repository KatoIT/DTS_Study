package oop;

import log.LogCustom;

public abstract class Shape {
    private String color;

    public String getColor() {
        return color;
    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract String getDetail();

    public abstract double perimeter();

    public abstract double area();

}

