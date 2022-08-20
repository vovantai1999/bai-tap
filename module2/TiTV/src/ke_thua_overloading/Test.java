package ke_thua_overloading;

public class Test {
    public static void main(String[] args) {
        MyMath m = new MyMath();
        System.out.println(m.timMin(5, 8));
        System.out.println(m.timMin(5.5, 7.8));
        System.out.println(m.tinhTong(5.0, 6.7));
        double arr[] = new double[]{1, 2, 4, 6, 8};
        System.out.println(m.tinhTong(arr));
    }
}

