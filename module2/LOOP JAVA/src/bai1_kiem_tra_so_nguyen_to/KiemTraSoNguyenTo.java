package bai1_kiem_tra_so_nguyen_to;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("type a number: ");
        int integer = scanner.nextInt();
        // if n < 2 -> not integer
        // 2 -> sqrt(n)
        if (integer < 2) {
            System.out.println(integer +"the number you just entered is not prime ");
        } else {
            int i = 2;

            while (i <= Math.sqrt(integer)) {
                if (!(integer % i == 0)) {
                    System.out.print("the number is prime");
                }
                if (integer % i == 0){
                    System.out.println("the number not is prime");
                }
                i++;
            }
        }
    }
}