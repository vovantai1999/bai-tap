package student_age;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson",  31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println(" Hiển thị các mục trong HashMap");
        System.out.println(hashMap);

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("-------------------------------------------------");
        System.out.println("Hiển thị theo thứ tự tăng dần của tên");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("--------------------------------------------------");
        System.out.println("tuổi của " + " Lewis " +linkedHashMap.get("Lewis"));
        System.out.println("tuổi của " + " Cook " +linkedHashMap.get("Cook"));
        System.out.println("tuổi của " + " Anderson " +linkedHashMap.get("Anderson"));
        System.out.println("tuổi của " + " Smith " +linkedHashMap.get("Smith"));


    }
}
