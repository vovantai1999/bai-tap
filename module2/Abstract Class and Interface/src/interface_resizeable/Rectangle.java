package interface_resizeable;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return "Retangle : " + " width = " + width
                + " Height = " + height + " color :" + "red "
                + " filled :" + " true " + " Area : " + getArea();
    }

    @Override
    public void resize(double percent) {
        this.width = this.width * percent / 100;
        this.height = this.height * percent / 100;

    }
}
