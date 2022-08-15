package bai2_minh_hoa_thuat_toan_sap_xep_noi_bot;

import java.util.Scanner;

public class Minh_Hoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước danh sách: ");
        int size = scanner.nextInt();
        int [] list =new int[size];
        System.out.println("Nhập "  + list.length + " giá trị");
        for (int i = 0; i < list.length ; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Danh sách đầu vào: ");
        for (int i = 0; i < list.length ; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBắt đầu xử lý sắp xếp...");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Tráo đổi " + list[i] + " với " + list[i + 1]);
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true; /* Next pass still needed */
                }
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Mảng có thể sắp xếp và không cần chuyển đổi");
                break;
            }
            /* Show the list after sort */
            System.out.print("liệt kê sau   " + k + " sắp xếp: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
