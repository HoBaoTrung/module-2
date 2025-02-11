package JavaCollectionFrameWork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        /*16: Dung lượng ban đầu (Initial Capacity): Đây là số lượng bucket ban đầu trong HashMap (mặc định là 16).

        0.75f: Hệ số tải (Load Factor): Khi số phần tử trong map vượt 75% dung lượng (16 * 0.75 = 12), nó sẽ tự động mở rộng gấp đôi kích thước.

        true: Chế độ truy cập (Access Order)
        Nếu là false (mặc định), LinkedHashMap duy trì thứ tự chèn (insertion order).
        Nếu là true, LinkedHashMap sẽ sắp xếp lại theo thứ tự truy cập (access order), tức là phần tử nào được truy cập gần nhất sẽ được đẩy xuống cuối danh sách.*/
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));//cặp {Lewis=29} sẽ được đưa xuống cuối danh sách. do cài đặt là true
    }
}
