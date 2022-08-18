package bai1_lop_hinh_chu_nhat;

import java.util.Scanner;

public class Hinh_Chu_Nhat {
    double width;
    double height;

    public Hinh_Chu_Nhat() {
    }

    public Hinh_Chu_Nhat(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }
    public String display(){
        return ("chiều rộng =" + width + "chiều dài =" + height);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width");
        double width = scanner.nextDouble();
        System.out.println("Enter Height");
        double height = scanner.nextDouble();
        Hinh_Chu_Nhat hcn = new Hinh_Chu_Nhat(width, height);
        System.out.println("hình chữ nhật có: " + hcn.display());
        System.out.println("chu vi là: "+ hcn.getPerimeter());
        System.out.println("diện tích là:" + hcn.getArea());
    }
}