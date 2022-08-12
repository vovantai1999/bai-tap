package baitap;

public class Demo {
    public static void main(String[] args) {
        int x = 1;
        int i;

        for (i = 0; i < 3; i = i + 2) {
            x = x + 1;
        }

        System.out.print(x);
        System.out.print(i);
    }
}
