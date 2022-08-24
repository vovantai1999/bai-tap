package interface_resizeable;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.omg.CORBA.PUBLIC_MEMBER;

public class Circle extends Shape implements Resizeable {
    private double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;

    }
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "circle = " + radius
                + " color = " + super.toString()
                + " Area circle = " + getArea();
    }

    @Override
    public void resize(double percent) {
        this.radius = radius * percent/100;

    }
}
