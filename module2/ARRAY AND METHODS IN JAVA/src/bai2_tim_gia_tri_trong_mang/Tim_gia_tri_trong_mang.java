package bai2_tim_gia_tri_trong_mang;

import java.util.Scanner;

public class Tim_Gia_Tri_Trong_Mang {
    public static void main(String[] args) {
        String[] students = {"Tai", "Tung", "Hieu", "Khanh", "Binh", "Quy"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên một học sinh: ");
        String input_name = scanner.nextLine();
        Boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Vị trí học sinh: " + input_name + " là:" + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Không tìm thấy " + input_name + " trong danh sách");
        }
    }
}