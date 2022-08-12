package bai4_chuong_trinh_chuyen_doi_nhiet_do;

import java.util.Scanner;

public class Chuong_trinh_chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius (F -> C) ");
            System.out.println("2. Celsius to Fahrenheit (C -> F)");
            System.out.println("0. Exit");
            input = scanner.nextInt();

            switch (input) {
                case 1: {
                    System.out.println("Enter Fahrenheit to Celsius");
                    int number = scanner.nextInt();
                    fahrenheitToCelsius(number);
                    System.out.println("Fahrenheit is: " + fahrenheitToCelsius(number));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius to Fahrenheit");
                    int number = scanner.nextInt();
                    celsiusTofahrenheit(number);
                    System.out.println("Celsius is : " + celsiusTofahrenheit(number));
                    break;
                }
                case 0:
                    System.exit(0);
            }
        } while (input != 0);
    }
    public static double  celsiusTofahrenheit (double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius (double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}



