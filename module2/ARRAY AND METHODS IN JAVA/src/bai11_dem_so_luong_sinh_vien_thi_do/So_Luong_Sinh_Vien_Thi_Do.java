package bai11_dem_so_luong_sinh_vien_thi_do;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class So_Luong_Sinh_Vien_Thi_Do {
    public static void main(String[] args) {
//       bước 1:  Khai báo các biến, nhập và kiểm tra kích thước mảng
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] array;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.print("Phần tử trong mảng không quá 30");
            }
        }while (size > 30);

//        bước 2: Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        int i = 0;
        while( i < array.length){
            System.out.println("Nhập điểm Sinh viên: " + ( i+1));
            array[i] = scanner.nextInt();
            i++;
        }
//        Bước 3 sử dụng vòng lặp for để in ds điểm thi dồng thời đếm số lượng sv thi đỗ
        int count = 0;
        System.out.print("Danh sách điểm thi: ");
        for (int j = 0;  j < array.length ;j++) {
            System.out.println(array[j] + "\t");
            if(array[j] >= 5 && array[j] <=10 )
                count++;

        }
        System.out.print("Số học sinh vượt qua kỳ thi là: " + count);
    }
}
