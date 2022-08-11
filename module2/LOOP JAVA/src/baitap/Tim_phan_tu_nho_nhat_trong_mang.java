package baitap;

public class Tim_phan_tu_nho_nhat_trong_mang {
    public static void main(String[] args) {
        int numbers[] = new int []{9,4,6,8,10,5};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < min ) min = numbers[i];
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là:" + min);
    }
}
