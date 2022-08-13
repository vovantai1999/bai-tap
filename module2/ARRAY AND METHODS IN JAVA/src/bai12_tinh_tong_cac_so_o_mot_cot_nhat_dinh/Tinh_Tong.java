package bai12_tinh_tong_cac_so_o_mot_cot_nhat_dinh;

import java.util.Scanner;

public class Tinh_Tong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhập vào 1 mảng hai chiều
        System.out.println("Enter row+column -> matrix : ");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int arr [][] = new int [3][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int random = (int) Math.floor((Math.random() * 10 - 2 + 1) + 2);
                arr[i][j] = random;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        // nhập vào stt 1 cột
            System.out.println("Enter column :");
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == number) {
                    sum += arr[i][j];
                }
            }
        }
        // tổng cột đó.
        System.out.print("Sum is: " + sum);
    }
}