package bai5_hien_thi_cac_loai_hinh;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Hien_thi_cac_laoi_hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // người dùng hiển thị menu các hình mà app có thể vẽ
        // kèm theo stt, ng dùng nhập vào, app sẽ vẽ hình tương ứng
        System.out.println("Menu ");
        System.out.println("1. Print a rectangle");
        System.out.println("2. Print a square");
        System.out.println("3. Print a triangle");
        System.out.println("4. exit");
        System.out.print("Please Enter ");

//        int input = scanner.nextInt();
        int geometry = -1;

        while (geometry != 0) {
            System.out.println("Menu");
            System.out.println("1. draw a rectangle");
            System.out.println("2. draw a square");
            System.out.println("3. draw a triangle");
            System.out.println("0. exit");
            System.out.println("Please Enter");
            int geometryWhile = scanner.nextInt();
            switch (geometryWhile) {
                case 0 :
                    System.exit(0);
//                    System.out.println("Menu");
//                    System.out.println("1. draw a rectangle");
//                    System.out.println("2. draw a square");
//                    System.out.println("3. draw a triangle");
//                    System.out.println("0. back menu");
//                    System.out.println("Please Enter");
//                    break;
                case 1 :
                    for (int i = 0; i < 5; i++) {
                        for (int j = 1; j < 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2 :
                    for (int i = 0; i < 5; i++) {
                        for (int j = 1; j < 15; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3 :
                    for (int i = 1; i < 10; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Please Enter 1 -> 3");
            };

        }
    }
}


