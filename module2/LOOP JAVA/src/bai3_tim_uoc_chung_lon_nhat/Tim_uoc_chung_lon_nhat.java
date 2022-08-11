package bai3_tim_uoc_chung_lon_nhat;

import java.util.Scanner;

public class Tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("type integer a: ");
        int a = scanner.nextInt();

        System.out.print("type integer b: ");
        int b = scanner.nextInt();

        // phan tich moi số ra thừa số
        // chọn ra các thừa số nguyên tố chung
        // lập các tích thừa số đã chọn
        // tích đó là UCLN

        if (a == 0 && b == 0) {
            System.out.println("Không có UCLN");
        } else if (a != 0 && b == 0) {
            System.out.println("UCLN là " + Math.abs(a));
        } else if (a == 0 && b != 0) {
            System.out.println("UCLN là " + Math.abs(b));
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        System.out.println("UCLN : " + a);
    }
}


