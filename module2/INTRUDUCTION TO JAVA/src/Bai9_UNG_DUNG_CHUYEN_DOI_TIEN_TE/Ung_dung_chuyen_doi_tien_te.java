package bai9_ung_dung_chuyen_doi_tien_te;

import java.util.Scanner;

public class Ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter money: ");
        int usd = scanner.nextInt();
        System.out.println("Conver vnd money is: " + usd * 23000);
    }
}
