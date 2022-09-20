package oop;

public class Rectangle extends Shape {
    private final double longEdge;
    private final double shortEdge;

    public Rectangle(double longEdge, double shortEdge, String color) {
        super(color);
        this.longEdge = longEdge;
        this.shortEdge = shortEdge;
    }

    @Override
    public String getDetail() {
        return "Rectangle:\n\tlongEdge: %f\n\tshortEdge: %f\n\tcolor:%s"
                .formatted(this.longEdge, shortEdge, super.getColor());
    }

    @Override
    public double perimeter() {
        return (longEdge + shortEdge) * 2;
    }

    @Override
    public double area() {
        return longEdge * shortEdge;
    }
}
