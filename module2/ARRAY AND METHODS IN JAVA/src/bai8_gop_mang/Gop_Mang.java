package bai8_gop_mang;

import java.util.Scanner;

public class Gop_Mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array1 = new int[4];
        int [] array2 = new int[4];
//        sử dụng vòng lặp nhập giá trị cho các phần tử
        System.out.println("Nhập giá trị đầu vào Mảng 1: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Nhập giá trị đầu vào Mảng 2: ");
        for (int i = 0; i < array2.length ; i++) {
            array2[i] = scanner.nextInt();
        }
        int i = array1.length + array2.length;
        int [] array3 = new int[i];
        int count = 0;
//        Duyệt mảng 1 để cộng vào mảng 3
        for (int j = 0; j < array1.length; j++) {
            array3[j] = array1[1];
            count++;
        }
        for (int j = 0; j < array2.length ; j++) {
            array3[j] = array2[j];
        }
        for (int j = 0; j <array3.length ; j++) {
            System.out.println(array3[j] + " ");

        }
    }
}

//        Scanner scanner = new Scanner(System.in);
//
//        int[] list1 = new int[4];
//        int[] list2 = new int[4];
//        // sử dụng vòng lặp nhập các giá trị cho các phần tử trong mảng
//        System.out.print("Enter input value into array 1 : ");
//        for (int i = 0; i < list1.length; i++) {
//            list1[i] = scanner.nextInt();
//        }
//        System.out.print("Enter input value into array 2 : ");
//        for (int i = 0; i < list2.length; i++) {
//            list2[i] = scanner.nextInt();
//        }
//        int i = list1.length + list2.length;
//        int[] arr = new int[i];
//        int count = 0;
//        // duyệt mảng 1 để + vào mảng 3
//        for (int j = 0; j < list1.length; j++) {
//            arr[j] = list1[j];
//            count++;
//        }
//        for (int j = 0; j < list2.length; j++) {
//            arr[count++] = list2[j];
//        }
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + " ");
//        }
//    }
//
//}