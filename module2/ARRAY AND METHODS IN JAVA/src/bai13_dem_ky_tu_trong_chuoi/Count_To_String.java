package bai13_dem_ky_tu_trong_chuoi;

import java.util.*;

public class Count_To_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rdString = "vantai";
        char fi = 'a';
        int count = 0;

        int len = rdString.length();
        for (int i = 0; i < len; i++) {
            if (rdString.charAt(i) == fi) {
                count++;
            }
        }
        System.out.println("Number of occurrences in string " + count);
    }
}