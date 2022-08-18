package static_methor;

public class StudentDemo {
    private int stt;
    private  String name;
    private static String school = "CGH";

    public StudentDemo(int stt, String name){
        this.name = name;
        this.stt = stt;
    }
    static void change(){
        school = "Codegym";
    }
    void display(){
        System.out.println(stt + " " + name + " " + school);
    }

    public static void main(String[] args) {
        StudentDemo.change();
        StudentDemo student1 = new StudentDemo(1, "Nam");
        StudentDemo student2 = new StudentDemo(2, "Hieu");
        StudentDemo student3 = new StudentDemo(3, "Ngoc");
        StudentDemo student4 = new StudentDemo(4, "Tai");

        student1.display();
        student2.display();
        student3.display();
    }
}
