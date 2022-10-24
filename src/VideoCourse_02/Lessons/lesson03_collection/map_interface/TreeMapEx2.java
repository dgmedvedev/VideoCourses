package VideoCourse_02.Lessons.lesson03_collection.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        TreeMap<Student, Double> treeMap = new TreeMap<>();
        TreeMap<Student, Double> treeMap2 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        Student st1 = new Student("Ivan", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Sidr", "Sidorov", 4);
        Student st4 = new Student("Sergey", "Petrov", 2);
        Student st5 = new Student("Igor", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
        treeMap.put(st1, 5.8);
        treeMap.put(st7, 9.1);
        treeMap.put(st5, 7.9);
        treeMap.put(st3, 7.2);
        treeMap.put(st6, 8.2);
        treeMap.put(st2, 6.4);
        treeMap.put(st4, 7.3);

        // Student имплементирует Comparable и переопределяет compareTo(), поэтому все ок, иначе вылетило бы Exception
        // также можно реализовать Comparator при создании объекта (например, как treeMap2)
        System.out.println(treeMap);
    }
}