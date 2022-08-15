package bai1_thuat_toan_sap_xep_noi_bot;

public class Sap_Xep_Noi_Bot {
    static int[] list = {1, 4, -5, 8, 3, 2, -6, 13};

    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 0; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length ; i++) {
            System.out.print(list[i] + " ");

        }
    }
}