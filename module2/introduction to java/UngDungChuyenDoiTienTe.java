import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter money: ");
        int usd = scanner.nextInt();
        System.out.println("Conver vnd money is: " + usd * 23000);
    }
}
