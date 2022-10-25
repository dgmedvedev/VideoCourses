package VideoCourse_02.Lessons.lesson03_collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        // 3-ий параметр (accessOrder) будет показывать, как мы хотим сохранять порядок:
        // порядок добавления элементов (false) или порядок использования элементов (true)
        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16, 0.75f, true);
        Student st1 = new Student("Ivan", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Sidr", "Sidorov", 4);
        lhm.put(5.8, st1);
        lhm.put(9.1, st2);
        lhm.put(7.9, st3);
        lhm.put(null, null);

        System.out.println(lhm);

        System.out.println(lhm.get(9.1)); // переместится на последнюю позицию, т.к. accessOrder - true

        System.out.println(lhm);
    }
}