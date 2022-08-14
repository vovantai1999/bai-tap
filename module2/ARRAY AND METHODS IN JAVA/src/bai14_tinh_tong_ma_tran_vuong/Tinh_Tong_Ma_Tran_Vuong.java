package bai14_tinh_tong_ma_tran_vuong;

import java.util.Scanner;

public class Tinh_Tong_Ma_Tran_Vuong {
    public static void main(String[] args) {
        Scanner scannner = new Scanner(System.in);
//        Nhập vào ma trận vuông
        int min = 5;
        int max = 9;
//        Nhập độ đai mảng bạn muốn
        System.out.println("Nhập độ dài mảng");
        int size = scannner.nextInt();
        int arr [][] = new int[size][size];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
                arr[i][j] = random;
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
//        tổng đường chéo chính
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of main diagonals : " + sum);
    }
}
