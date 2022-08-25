package interface_colorable;

import sun.security.mscapi.CPublicKey;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(6);
        shapes[2] = new Rectangle(5, 6);
//        in ra mảng và diện tích:
        System.out.println("area of elements in array");
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());

//            System.out.println(shape.toString());

            if (shape instanceof Square) {
                ((Square) shape).getPerimeter();
                Colorable colorable = (Square) shape;
                colorable.howToColor();
//        }   else if (shape instanceof Rectangle){
//                Colorable colorable = (Square) shape;
            }
        }
    }
}

