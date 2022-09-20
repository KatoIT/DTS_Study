package oop;

public class Square extends Rectangle {
    private final double edge;

    public Square(double edge, String color) {
        super(edge, edge, color);
        this.edge = edge;
    }

    @Override
    public String getDetail() {
        return "Square:\n\tedge: %f\n\tcolor:%s".formatted(this.edge, super.getColor());
    }
}
