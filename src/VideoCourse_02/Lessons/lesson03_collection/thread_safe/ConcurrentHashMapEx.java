package VideoCourse_02.Lessons.lesson03_collection.thread_safe;

import java.util.HashMap;

public class ConcurrentHashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Ivan");
        map.put(2, "Ivan");
        map.put(3, "Ivan");
        map.put(4, "Ivan");
        map.put(5, "Ivan");
        System.out.println(map);
    }
}