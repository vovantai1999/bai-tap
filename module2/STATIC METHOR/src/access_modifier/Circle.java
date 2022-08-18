package access_modifier;

public class Circle {
    double radius = 1.0;
     String color = "red";
     public Circle(){
     }
     public Circle(double radius){
         this.radius = radius;
     }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
         return Math.pow(getRadius(),2)* Math.PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());
    }
}
