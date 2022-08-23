package abstract_class;

public class Main {
    public static void main(String[] args) {
        ToaDo td1 = new ToaDo(5,5);
        ToaDo td2 = new ToaDo(6,8);
        ToaDo td3 = new ToaDo(7,12);

        Hinh h1 = new Diem(td1);
        Hinh h2 = new HinhTron(td2 , 10);
        Hinh h3 = new HinhChuNhat(td3, 12, 3);

        System.out.println("diện tích 1 = " + h1.tinhDienTich());
        System.out.println("diện tích 2 = " + h2.tinhDienTich());
        System.out.println("diện tích 3 = " + h3.tinhDienTich());
        }


    }

