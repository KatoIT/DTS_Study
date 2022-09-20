package oop;

public class Triangle extends Shape {
    private final double edgeOne;
    private final double edgeTwo;
    private final double edgeThree;

    public Triangle(double edgeOne, double edgeTwo, double edgeThree, String color) {
        super(color);
        this.edgeOne = edgeOne;
        this.edgeTwo = edgeTwo;
        this.edgeThree = edgeThree;
    }

    @Override
    public double perimeter() {
        return edgeOne + edgeTwo + edgeThree;
    }

    @Override
    public double area() {
        double nuaChuVi = perimeter();
        return Math.sqrt(nuaChuVi * (nuaChuVi - edgeOne) * (nuaChuVi - edgeTwo) * (nuaChuVi - edgeThree));
    }

    @Override
    public String getDetail() {
        return "Triangle:\n\tedgeOne: %f\n\tedgeTwo: %f\n\tedgeThree: %f\n\tcolor:%s".formatted(this.edgeOne, this.edgeTwo, this.edgeThree, super.getColor());
    }
}
