package oop;

import log.LogCustom;

import java.util.ArrayList;
import java.util.List;

public class OOPDemo {
    public void start() {
        LogCustom log = new LogCustom(this.getClass().getName());
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3.5, "Blue"));
        shapes.add(new Triangle(3, 4, 6, "Red"));
        shapes.add(new Rectangle(4, 3, "Yellow"));
        shapes.add(new Square(5, "Gray"));
        //
        for (Shape shape :
                shapes) {
            log.info(shape.getDetail() + "\n\tperimeter: " +  shape.perimeter() + "\n\tarea:  " + shape.area());
        }
    }
}
