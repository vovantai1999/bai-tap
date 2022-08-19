package bai1_geometry;

public class Circle extends Geometry {
    private double radius = 1.0;

    public Circle(double v, String indigo, boolean b) {
    }
    public Circle(double radius){
        this.radius =radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius *Math.PI;
    }
    public double getPerimeter(){
        return 2 *radius * Math.PI;
    }
    public String toString(){
        return ("hình tròn có bán kính = " + getRadius());
    }
}
