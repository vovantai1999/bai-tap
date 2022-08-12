package bai5_tim_gia_tri_nho_nhat;

public class Gia_Tri_Nho_Nhat_Trong_Mang {
    public static void main(String[] args) {
        int [] arr = {4,6,1,98,-12,-3,8};
        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[index]);
    }
    private static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length ; i++) {
            if(array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}

