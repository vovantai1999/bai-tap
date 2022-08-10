import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        System.out.println("GIẢI PHƯƠNG TRÌNH BẬC NHẤT");
        System.out.println("Cho một phương trình dưới dạng: a*x + b = c ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a =scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();
        if(a!=0){
            double answer = (c -b)/a;
            System.out.println("Phương trình có nghiệm x = " + answer);
        }
        else{
            if(b==c){
                System.out.println("The solution is all x!");
            }
            else {
                System.out.println("No solution!");
            }
        }

    }
}
