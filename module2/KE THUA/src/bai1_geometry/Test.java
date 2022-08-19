package bai1_geometry;

public class Test {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        System.out.println(geometry);
        geometry = new Geometry("red", false);
        System.out.println(geometry);



        Circle circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);


    }
}
