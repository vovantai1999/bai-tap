package bai1_geometry;

public abstract class Rectangle extends Geometry {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;

    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public abstract void setLength(double length);

    public String toString(){
        return ("Hình chữ nhật có chiều rộng = " + getWidth()
                + " chiều dài " + getLength());
    }
}
