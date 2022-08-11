package bai2_ung_dung_tinh_tien_lai;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền vay: ");
        int tien_vay = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập lãi suất : ");
        int lai_suat =  Integer.parseInt(scanner.nextLine());



//        int tien_lai = tien_vay * lai_suat/100 / 12 * so_ngay;
//        for (int i = 1; i <= so_ngay; i++) {
//            sum += tien_lai;
//        }
        // mời quý khách nhập lựa chọn theo tuần, tháng, quý, năm
        // nếu nhập vào tuần: tháng /4.. quý = tháng * 3,
        System.out.print("Lựa chọn Tuần , Tháng, Qúy , Năm: ");
        String date = scanner.nextLine();
        int sum = 0;
        System.out.print("Nhập thời gian vay ");
        int so_ngay = Integer.parseInt(scanner.nextLine());
        switch (date) {
            case "week" :

                for (int i = 1; i <= so_ngay; i++) {
                    sum += tien_vay * (lai_suat/100 / 12)/4 * so_ngay;
                }
                System.out.println(" in"+ so_ngay + "week : " + sum);
                break;
            case "month" :

                for (int i = 1; i <= so_ngay; i++) {
                    sum += tien_vay * (lai_suat/100 / 12) * so_ngay;
                }
                System.out.println("interest in" + so_ngay +"month : " + sum);
                break;
            case "tangerine" :
                for (int i = 1; i <= so_ngay; i++) {
                    sum += tien_vay * (lai_suat/100 / 12)*3 * so_ngay;
                }
                System.out.println("interest in "+ so_ngay + "tangerine : " + sum);
                break;
            case "year" :
                for (int i = 1; i <= so_ngay; i++) {
                    sum += tien_vay * lai_suat/100 * so_ngay;
                }
                System.out.println("interest in "+ so_ngay + "year : " + sum);
                break;
        }
    }
}
//        System.out.println("interest is :" +  tien_lai);
//        System.out.println("after"+ so_ngay + "month : " + sum);