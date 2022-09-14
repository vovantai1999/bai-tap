package bai1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Certificated> certificateds1 = new ArrayList<Certificated>();
        certificateds1.add( new Certificated(1, "Trùm", "Thách đấu", "20/10/2022"));
        certificateds1.add(new Certificated(2, "Trùm", "Thách đấu", "20/10/2022"));
        Experience experience = new Experience("Quý", "25/02/2002",
                "0120301", "quy@gmail.com",
                10,"Pro", certificateds1);
        experience.showMe();
        Intern intern = new Intern("Hướng", "20/10/2000",
                "0230203012","huong@gmail.com",
                "IT", "HK2",
                "Đại học công nghệ thông tin Sài Gòn", certificateds1);
        intern.showMe();
        Fresher fresher = new Fresher("Lộc", "29/2/2002",
                "9230280382", "loc@gmail.com",
                "2020", "Giỏi", "Đại học công nghệ thông tin Sài Gòn", certificateds1);
        fresher.showMe();
        fresher.setFullName("Tùng");

        System.out.println(certificateds1.toString());
    }
}
