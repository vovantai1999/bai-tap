package bai3_cai_dat_thuat_toan_sap_xep_chon;

public class Selection_Sort {
    static double[] list = {2, 6.6, 9, 5.5, 13, 7.3, 44, 3.3};

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int curentMinIndex = i;

            int currentMinIndex =  0;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}


