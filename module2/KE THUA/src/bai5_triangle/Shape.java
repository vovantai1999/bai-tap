package bai5_triangle;

public class Shape {
    protected double side;

    public Shape() {
    }

    public Shape(double side) {
        this.side = side;
    }

    public String toString() {
        return (" side = " + side);
    }
}
