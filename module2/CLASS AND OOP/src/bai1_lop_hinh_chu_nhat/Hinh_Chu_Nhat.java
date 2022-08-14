package bai1_lop_hinh_chu_nhat;

import java.util.Scanner;

public class Hinh_Chu_Nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width");
        double width = scanner.nextDouble();
        System.out.println("Enter heigth");
        double height = scanner.nextDouble();
        DrawRectangle rectangle1 = new DrawRectangle(width, height);
        System.out.println(rectangle1.display());
//        System.out.println("Show rectengle " + rectangle1.display());
//        System.out.println("Area rectangle " + rectangle1.getArea());
//        System.out.println("Perimeter " + rectangle1.getPerimeter());
    }

    public static class DrawRectangle {
        private double width;
        private double height;
        public DrawRectangle() {}
        public DrawRectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }
        public double getWidth() {
            return width;
        }
        public void setWidth(double width) {
            this.width = width;
        }
        public void setHeight(double height) {
            this.height = height;
        }
        public double getHeight() {
            return height;
        }
        public double getArea() {
            return width * height;
        }
        public double getPerimeter() {
            return (width + height) * 2;
        }
        public String display() {
            return "Area Rectangle = "
                    + getArea()
                    + " Perimeter Rectangle "
                    + getPerimeter();
        }
    }
}


