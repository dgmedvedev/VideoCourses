package videoCourse_02.lessons.lesson03_collection.set_interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Ivan");
        set.add("Oleg");
        set.add("Semen");
        set.add("Marina");
        System.out.println(set);

        set.remove("Ivan");

        for (String s : set) {
            System.out.print(s + ", ");
        }

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Oleg"));
    }
}