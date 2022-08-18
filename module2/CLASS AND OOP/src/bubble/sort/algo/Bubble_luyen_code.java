package bubble.sort.algo;

import java.sql.SQLOutput;

public class Bubble_luyen_code {
    static int[] arr = {12, 5, 6, 23, -54, -6, 55, 23, -7};

    public static void bubleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubleSort(arr);
        for (int i =0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}






