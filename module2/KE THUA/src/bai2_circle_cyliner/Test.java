package bai2_circle_cyliner;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(12);
        circle.setColor("green");
        circle.getArea();
        System.out.println(circle);
        System.out.println("Diện tích là " + circle.getArea());
        System.out.println("================================");

        Cyliner cyliner = new Cyliner();
        cyliner.setRadius(12);
        cyliner.setHight(2);
        cyliner.setColor("red");
        System.out.println(cyliner);
        System.out.println("thể tích là: " + cyliner.getV());


    }
}
