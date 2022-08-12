package bai7_them_phan_tu_vao_mang;

import java.util.Scanner;

public class Them_Phan_Tu_Vao_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 20; // Suc chua cua mang
        int[] arr = new int[size];
        arr[0] = 1;
        arr[1] = -1;
        arr[2] = 6;
        arr[3] = 5;
        arr[4] = 3;
        int n = 5; // So luong phan tu trong mang hien tai
        System.out.println("Enter number");
        int x = scanner.nextInt();

        System.out.println("Nhập vị trí phần tử Thêm");
        int index = scanner.nextInt();
        System.out.print("Truoc khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        // Inserting key
        n = insert(arr, size, n, x, index);
        System.out.print("\nSau khi them: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    static int insert(int[] arr, int size, int n, int x,int index) {
        // Neu so luong phan tu lon hon hoac bang suc chua cua mang thi khong the them
        if (n >= size) {
            return n;
        }
        // them X vao vi tri cuoi cua mang
        if (index < 0 || index > n) {
            return n;
        }

        for (int i = n; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        return n + 1; // tang so luong phan tu cua mang them 1
    }
}
