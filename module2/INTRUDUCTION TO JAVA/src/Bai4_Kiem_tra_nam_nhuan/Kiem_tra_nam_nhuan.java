package Bai4_Kiem_tra_nam_nhuan;

import java.util.Scanner;

public class Kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập số năm cần kiểm tra: ");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm " + year + " là năm nhuận");
                } else {
                    System.out.println(" Năm " + year + " Không phải là năm nhuận ");
                }
            } else {
                System.out.println("Năm " + year + " là năm nhuận");
            }
        } else{
            System.out.println(" Năm " + year + " Không phải là năm nhuận ");
        }
    }
}


