package videoCourse_02.lessons.lesson03_collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEx2 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>(16, 0.75f); // default значения 16 и 0.75

        Student st1 = new Student("Ivan", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Sidr", "Sidorov", 2);
        map.put(st1, 7.7);
        map.put(st2, 8.7);
        map.put(st3, 9.7);
        System.out.println(map);

        // очень важно, чтобы key был immutable объектом. Для этого класс Student преобразуем в final
        System.out.println(map.containsKey(st1)); // true
        System.out.println(st1.hashCode());
        // st1.course = 4; // если значение изменилось, то и hashCode изменится и такого объекта в map нету
        // System.out.println(map.containsKey(st1)); // false
        // System.out.println(st1.hashCode());
    }
}