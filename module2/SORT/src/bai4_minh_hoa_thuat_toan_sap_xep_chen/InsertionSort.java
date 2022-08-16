package bai4_minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 8, 9, 5, 12, 23, 45, 15};
        insertionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void insertionSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
    }

}




//import java.util.Arrays;
//
//public class InsertionSort {
//    public static void main(String[] args) {
//        int[] numbers = {3, 7, 8, 9, 5, 12, 23, 45, 15};
//        insertionSort(numbers);
//        System.out.println(Arrays.toString(numbers));
//    }
//
//    public static void insertionSort(int[] list) {
//        int pos,x;
//        int leng = list.length;
//        for (int i = 1; i < leng; i++) {
//            x = list[i];
//            pos = i;
//            while (pos > 0 && x < list[pos - 1]) {
//                list[pos] = list[pos - 1];
//                pos--;
//            }
//            list[pos] = x;
//        }
//    }
//}