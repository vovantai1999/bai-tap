package static_methor;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Student {
    private int rollno;
    private String name;
    private static String collge = "CGH";

    // hàm khởi tạo để khởi tạo biến
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    //    PHƯƠNG THƯC STATIC ĐỂ THAY ĐỔI BIẾN STATIC
    static void change() {
        collge = "codegym";
    }

    //    phương pháp hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + collge);
    }

    public static class TestStaticMethod {
        public static void main(String[] args) {
            Student.change(); // gọi phương thức thay đổi
//            tạo đối tượng
            Student student1 = new Student(11, "Nam");
            Student student2 = new Student(12, "Ngoc");
            Student student3 = new Student(13, "Hoang");
//            gọi phương thức hiển thị
            student1.display();
            student2.display();
            student3.display();

        }
    }
}
