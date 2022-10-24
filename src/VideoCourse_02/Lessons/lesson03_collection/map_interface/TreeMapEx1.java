package VideoCourse_02.Lessons.lesson03_collection.map_interface;

import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Ivan", "Ivanov", 3);
        Student st2 = new Student("Petr", "Petrov", 1);
        Student st3 = new Student("Sidr", "Sidorov", 4);
        Student st4 = new Student("Sergey", "Petrov", 2);
        Student st5 = new Student("Igor", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
        treeMap.put(5.8, st1);
        treeMap.put(9.1, st7);
        treeMap.put(7.9, st5);
        treeMap.put(7.2, st3);
        treeMap.put(8.2, st6);
        treeMap.put(6.4, st2);
        treeMap.put(7.3, st4);

        System.out.println(treeMap);
        System.out.println(treeMap.get(6.4));
        treeMap.remove(5.8);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap()); // элементы выводятся по убыванию значения key, но treeMap не меняется
        System.out.println(treeMap);
        System.out.println(treeMap.tailMap(7.3)); // элементы со значением key от больше или равно 7.3
        System.out.println(treeMap.headMap(7.3)); // элементы со значением key МЕНЬШЕ 7.3
        System.out.println(treeMap.lastEntry()); // последний элемент treeMap
        System.out.println(treeMap.firstEntry()); // первый элемент treeMap
    }
}