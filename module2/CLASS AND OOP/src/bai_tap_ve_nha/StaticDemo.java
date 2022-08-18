package bai_tap_ve_nha;

import javax.sound.midi.Soundbank;

public class StaticDemo {
    public String name;
    public int age;
    public double weigh;
    public static String universityName = "Codegym Huế";
    public static int total = 0;

    public StaticDemo(String name, int age, double weigh) {
        this.name = name;
        this.age = age;
        this.weigh = weigh;
        total += 1;
    }

    public static void main(String[] args) {
        StaticDemo student1 = new StaticDemo("nam", 23, 20 );
        System.out.println("universityName:" + student1.universityName);

        System.out.println("total: " + StaticDemo.total);
        StaticDemo student2 = new StaticDemo("tai", 12, 23);
        System.out.println("total: " + StaticDemo.total);

    }

}


