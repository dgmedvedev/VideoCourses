package VideoCourse_02.Lessons.lesson03_collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(1);
        linkedHashSet.add(8);
        linkedHashSet.add(10);

        System.out.println(linkedHashSet);
        linkedHashSet.remove(8);
        System.out.println(linkedHashSet.contains(8)); // false
        System.out.println(linkedHashSet); // [5, 3, 1, 10]

        linkedHashSet.add(3); // Set хранит в себе уникальные элементы, поэтому 3 перезапишет старую 3
        System.out.println(linkedHashSet); // [5, 3, 1, 10]
    }
}