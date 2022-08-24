package interface_resizeable;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;

    }
    public Square(String color, boolean filled, double side){
        super(color, filled);
        this.side = side;
    }
    public Square(){}
    public String getColor(){
        return super.getColor();
    }
    public void setColor( String color){
        super.setColor(color);
    }
    public double getSide(){
        return side;
    }
    public void setSide( double side){
        this.side = side;
    }
    public  double getArea(){
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + super.toString() +
                '}';
    }

    @Override
    public void resize(double x) {
        this.side = Math.random()* 100 + ( this.side * x) -1;

    }
}
