package bai1_lop_hinh_chu_nhat;

import java.util.Scanner;

public class Rectangle {
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }
    public String display(){
        return ("width = " + width + " height = " + height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width");
        double width = scanner.nextDouble();
        System.out.println("Enter Hight");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật: " + rectangle.display());
        System.out.println("Chu vi là:" + rectangle.getPerimeter());
        System.out.println("Diện tích là:" + rectangle.getArea());
    }
}