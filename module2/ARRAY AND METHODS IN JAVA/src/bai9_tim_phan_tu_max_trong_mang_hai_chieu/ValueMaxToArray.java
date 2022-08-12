package bai9_tim_phan_tu_max_trong_mang_hai_chieu;

import java.util.Scanner;

public class ValueMaxToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập Hàng và Cột");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int [][] array = new int [x][y];
        System.out.println("Nhập 2 số bất kỳ ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                int random = (int) Math.floor(Math.random() * num2 - num1 + 1) + num1;
                array[i][j] = random;
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        int max = array[0][0];
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max){
                    max = array[i][j];
                }
                
            }
            
        }
        System.out.println("Gía trị lớn nhất " + max);
    }
}
