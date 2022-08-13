package bai10_tim_gia_tri_nho_nhat_trong_mang;
import java.util.*;

public class Value_Min_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        bước 1: khai báo mảng số nguyên gồm size phần tử.
        int size = 5;
        int arr[] = new int[size];
//        int numbers = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min in array " + min);
    }
}