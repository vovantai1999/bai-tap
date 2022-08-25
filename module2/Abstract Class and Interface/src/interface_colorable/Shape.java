package interface_colorable;

import javax.swing.plaf.PanelUI;

public class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;

    }

    public Shape() {
    }
    public String getColor(){
        return color;
    }
    public void setColor( String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    public double getArea(){
        return 0;
    }
    public double Perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
