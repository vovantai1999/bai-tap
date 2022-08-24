package interface_resizeable;

public abstract class Shape implements Resizeable {
    private String color = "green";
    private boolean fillled = false;

    public Shape() {
    }

    public Shape(String color, boolean fillled) {
        this.color = color;
        this.fillled = fillled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFillled() {
        return fillled;
    }

    public void setFillled(boolean fillled) {
        this.fillled = fillled;
    }
    public double getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape { " +
                " color= ' " + color + '\'' +
                ", fillled = " + fillled +
                '}';
    }
}
