import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        launch();
    }

    static Scanner scanner = new Scanner(System.in);

    private static void launch() {
        do {
            mainMenu();
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    optionUser();
                    break;
                case 2:
                    break;
                case 3:
                    break;
            }

        } while (true);
    }

    private static void optionUser() {
        int option = -1;
        // do {
        menuUser();
        System.out.print("=>");
        option = Integer.parseInt(scanner.nextLine());
        switch (option) {
            case 1:
                addUser();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                // option=-1;
                break;
            default:
                System.out.println("Nhap chua dung  nhap lai");
                break;
        }
        // } while (option != 4);
    }

    private static void addUser() {
        System.out.println("Them nguoi dung thanh cong");
        System.out.println("Nhan Enter hoac nut ki de quay lai");
        scanner.nextLine();
    }

    public static void menuUser() {
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪  USERS MANAGER  ⚪ ⚪ ⚪ ⚪ ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪     1. Thêm người dùng               ⚪");
        System.out.println("⚪     2. Sửa thông tin người dùng      ⚪");
        System.out.println("⚪     3. Hiện danh sách người dùng     ⚪");
        System.out.println("⚪     4. Quay lại                      ⚪");
        System.out.println("⚪                                      ⚪");
        System.out.println("⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ⚪ ");
    }

    public static void mainMenu() {
        System.out.println("\t ✬ ✬ ✬ ✬ ✬ ✬ ✬MAIN MENU✬ ✬ ✬ ✬ ✬ ✬ ✬");
        System.out.println("\t ✬                                 ✬");
        System.out.println("\t ✬     1. Quản lí người dùng       ✬");
        System.out.println("\t ✬     2. Quản lí bánh             ✬");
        System.out.println("\t ✬     3. Quản lí đơn đặt hàng     ✬");
        System.out.println("\t ✬                                 ✬");
        System.out.println("\t ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬ ✬");
    }
}