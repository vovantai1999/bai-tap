package bai8_tinh_chi_so_can_nang;

import java.util.Scanner;

public class Tinh_chi_so_can_nang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhập cân nặng(kg)");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao(mét)");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.println("Chỉ số cân nặng cơ thể là: " + bmi);
        if (bmi <= 18.5) {
            System.out.println(" Thiếu cân nặng");
        } else if (bmi < 25.0) {
            System.out.println("Bình thường");
        } else if (bmi < 30.0) {
            System.out.println("Thừa cân nặng");
        } else {
            System.out.println("Béo phì");
        }
    }
}
