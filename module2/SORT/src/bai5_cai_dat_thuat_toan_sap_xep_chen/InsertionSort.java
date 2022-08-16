package bai5_cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    public static double[] numbers = {2.5, 5.7, 73, 1.2, -4.5, 5.5, 2.9};

//    public static void insertionSort(double[] number) {
//        int length = arr.length;
//        int j;
//        double k;
//        for (int i = 1; i < length; i++) {
//            j = i ;
//            k = (int) arr[i];
//            while (j >= 0 && k < arr[j - 1 ]) {
//                arr[j] = arr[j - 1];
//                j--;
//            }
//            number[j] = k;
//        }
//    }
//
//    public static void main(String[] args) {
//        insertionSort(arr);
//        System.out.println("mảng sau khi sắp xếp");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }
//    }



//    public static double[] numbers = {3.4, 4.5, 2.5, 8.9, 7.8, 12.2, 23.2, 11.8};
//
    public static void insertionSort(double[] numbers) {
        int pos;
        double x;
        int leng = numbers.length;
        for (int i = 1; i < leng; i++) {
            pos = i;
            x = numbers[i];
            while (pos > 0 && x < numbers[pos - 1]) {
                numbers[pos] = numbers[pos - 1];
                pos--;
            }
            numbers[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(numbers);
        System.out.println("After sertion Sort ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " \t");
        }
    }
}