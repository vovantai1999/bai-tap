package interface_resizeable;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle circle = new Circle(4);
        System.out.println("circle before : " + circle);
        Square square = new Square(12);
        System.out.println(" Square before:" + square);
        Rectangle rectangle = new Rectangle();
        System.out.println(" rectangle before " + rectangle);
        System.out.println("-------------------------------------------------------------------");



        // khai báo 1 biến random từ 1- 100 để set kích thước
        double percent = Math.floor(Math.random() * 100 - 1);
        // thay đổi kích thước
        circle.resize(percent);
        shapes[0] = circle;

        rectangle.resize(percent);
        shapes[1] = rectangle;

        square.resize(percent);
        shapes[2] = square;

        System.out.println("Array after resizing " + Arrays.toString(shapes));
    }
}
