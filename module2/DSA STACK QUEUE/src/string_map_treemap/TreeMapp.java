package string_map_treemap;

import java.util.*;

public class TreeMapp {
    public static void main(String[] args) {

        // 1.tạo treemap , dùng để luuw trữ số lượng
        String example = "Code Gym, Gym, Hue. Hue. City, ";
        // duyệt và thay đổi những kí tự có trên chuỗi
        example.replace("," , "");
        example.replace("." , "");
        String[] arr = example.split(" ");
        // 2.duyệt toàn bộ chuỗi
        String key = "";
        int value;
        TreeMap<String, Integer> map = new TreeMap<>();
        // 3.mỗi từ lấy ra từ chuỗi, chuyển toàn bộ thành chữ hoa hoặc
        // chữ thường. coi mỗi từ lấy ra là 1 key
        for (int i = 0; i < arr.length; i++) {
            key = arr[i].toLowerCase();
            if (map.containsKey(key)) {
                value = map.get(key);
                map.remove(key);
                map.put(key, value + 1);
            } else {
                map.put(key , 1);
            }
        }

        // 4. kiểm tra trong map có key chưa? nếu có đẩy key vào map
        // tăng value lên 1.
        // key mà chưa có, thì đây r key vào map mặc định gán value là 1
        Object obj = new Object();
        Set set = map.keySet();
        Iterator i = set.iterator();
        while (i.hasNext()) {
            key = (String) i.next();
            System.out.println(" Từ" +
                    " ' " + key + " ' xuất hiện "
                    +      map.get(key) + " lần");
        }

    }
}