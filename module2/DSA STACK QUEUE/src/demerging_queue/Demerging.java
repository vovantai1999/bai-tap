package demerging_queue;

import java.util.Scanner;

public class Demerging {
    public static void main(String[] args) {
        Queue QueueNu = new Queue();
        Queue QueueNam = new Queue();

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so luong nguoi trong danh sach : ");
        int num = input.nextInt();

        String name, gender;
        int day, month, year;
        int i = 1;
        while (i <= num) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Ho va ten nv" + i + ": ");
            name = scanner.nextLine();
            do {
                System.out.print(" Gioi tinh nv" + i + ": ");
                gender = scanner.nextLine();
                if ((!gender.equals("NU")) && (!gender.equals("NAM"))) {
                    System.out.println("Nhap lai gioi tinh !");
                }
            }
            while ((!gender.equals("NU")) && (!gender.equals("NAM")));

            Scanner integer = new Scanner(System.in);
            System.out.print(" Ngay sinh nv" + i + ": ");
            day = integer.nextInt();
            System.out.print(" Thang sinh nv" + i + ": ");
            month = integer.nextInt();
            System.out.print(" Nam sinh nv" + i + ": ");
            year = integer.nextInt();
            if (gender.equals("NU")) {
                QueueNu.enQueue(name, gender, day, month, year);
            } else
                QueueNam.enQueue(name, gender, day, month, year);
            i++;
        }
        while (!QueueNu.isEmpty()) {
            System.out.println(QueueNu.deQueue());
        }
        while (!QueueNam.isEmpty()) {
            System.out.println(QueueNam.deQueue());
        }
    }
}