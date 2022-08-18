package static_methor;

public class StudentDemo {
    private int rollno;
    private String name;
    private static String college = "CGH";

    StudentDemo(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    static void change() {
        college = "codegym";
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    //    public static class TestStaticMethod {
    public static void main(String[] args) {
        StudentDemo.change();
        StudentDemo student1 = new StudentDemo(1, "Nam");
        StudentDemo student2 = new StudentDemo(2, "Hoa");
        StudentDemo student3 = new StudentDemo(3, "Ngoc");

        student1.display();
        student2.display();
        student3.display();
    }
}

