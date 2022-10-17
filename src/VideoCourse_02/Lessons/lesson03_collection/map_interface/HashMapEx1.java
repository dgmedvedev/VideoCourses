package VideoCourse_02.Lessons.lesson03_collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "Dima");
        map.put(125, "Ivan Ivanov");
        map.put(300, "Sidr Sidorov");
        map.put(null, "Petr Petrov");
        map.put(18, null);

        System.out.println(map);

        map.putIfAbsent(100, "Sasha"); // добавляет, если нет ключа со значением 100 (в данном примере не добавит)
        System.out.println(map.get(300)); // возвращает значение по ключу - Sidr Sidorov
        map.remove(300); // удаляет по ключу
        System.out.println(map);

        System.out.println(map.containsKey(100)); // true, проверяет есть ли такой ключ в map
        System.out.println(map.containsValue("Dima")); // true, проверяет есть ли такое значение в map

        System.out.println(map.keySet()); // возвращает множество ключей из map
        System.out.println(map.values()); // возвращает все значения map
    }
}