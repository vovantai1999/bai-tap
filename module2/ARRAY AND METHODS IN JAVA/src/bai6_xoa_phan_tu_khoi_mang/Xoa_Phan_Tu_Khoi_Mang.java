package bai6_xoa_phan_tu_khoi_mang;

import java.util.Scanner;

public class Xoa_Phan_Tu_Khoi_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = new int[20];
//        int[] arr = {1,2,4,6,7,8,2,5};
        arr[0] = 6;
        arr[1] = 3;
        arr[2] = 7;
        arr[3] = 8;
        arr[4] = 9;
        arr[5] = 5;
        arr[6] = 3;
        arr[7] = 6;
        int size = arr.length; // độ dài mảng
        int n = 8; // số phần tử của mảng

        System.out.println("Phần tử Mảng Trước khi xóa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("Nhập phần tử cần xóa");
        int number = scanner.nextInt();

        n = deleteElement(arr, n, number);

        System.out.println("Phần tử Mảng Sau khi xóa: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int deleteElement(int[] arr, int n, int key) {
        int position = searchElement(arr, key);
        if (position == -1) {
            System.out.println("Không tìm thấy phần tử trong Mảng: ");
        }
        for (int i = position; i < n; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }

    public static int searchElement(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}

