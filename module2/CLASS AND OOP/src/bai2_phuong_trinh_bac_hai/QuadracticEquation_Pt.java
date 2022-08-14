package bai2_phuong_trinh_bac_hai;

import java.util.Scanner;

public class QuadracticEquation_Pt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadracticEquation quadratic = new QuadracticEquation(a, b, c);
        // delta = b^2 - 4ac;
        // delta > 0 có 2 nghiệm -b +- Math.sqrt(b*b - 4*a*c)/2a;
        // delta < 0 vô nghiệm
        // delta = 0 có 1 nghiệm -b/2a
        if (quadratic.getDelta() > 0) {
            System.out.println("The equation has two solution " +
                    (-b + (Math.sqrt(b*b - 4*a*c))/ 2* a)
                    + " and "
                    + (-b - (Math.sqrt(b*b - 4*a*c))/ 2* a));
        } else if (quadratic.getDelta() == 0) {
            System.out.println("The Equation has a solution "
                    + (-b / 2*a ));
        } else {
            System.out.println("The equation has no solution");
        }

    }
    public static class QuadracticEquation {
        private double a;
        private double b;
        private double c;

        public QuadracticEquation(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public double getA() {
            return a;
        }

        public double getB() {
            return b;
        }

        public double getC() {
            return c;
        }
        public double getDelta() {
            return Math.pow(b, 2) - 4 * a * c;
        }
    }
}


