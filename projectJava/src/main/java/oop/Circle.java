package oop;

import log.LogCustom;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public double area() {
        return radius * Math.PI * Math.PI;
    }

    @Override
    public String getDetail() {
        return "Circle:\n\tr: %f\n\tcolor:%s".formatted(this.radius, super.getColor());
    }
}
