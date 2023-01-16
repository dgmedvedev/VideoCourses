package videoCourse_01.lessons.lesson20;

import java.util.HashMap;
import java.util.Map;

public class Test12_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Ivan");
        map.put(778, "Petrov Petr");
        map.put(779, "Sidorov Sidr");
        map.put(780, "Roberto Carlos");
        map.put(779, "Badov Bad");      // перезапишет (779, "Sidorov Sidr") т.к. совпадает key
        map.put(781, "Petrov Petr");
        map.remove(780);

        System.out.println("map = " + map);
    }
}
