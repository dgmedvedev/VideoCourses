package VideoCourse_02.Lessons.lesson06_stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1_map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("ok");
        list.add("good");
        list.add("bad");

        List<Integer> list1 = list.stream().map(String::length).toList();
        System.out.println(list);
        System.out.println(list1);
        System.out.println("----------------");

        int[] array = {5, 9, 3, 8, 1};
        System.out.println(Arrays.toString(array));
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element /= 3;
            }
            return element;
        }).toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("----------------");

        Set<String> set = new TreeSet<>();
        set.add("hello");
        set.add("ok");
        set.add("good");
        set.add("bad");
        System.out.println(set);   // [bad, good, hello, ok]
        Set<Integer> set2 = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        System.out.println(set2);  // [2, 3, 4, 5]
        List<Integer> list2 = set.stream().map(el -> el.length()).collect(Collectors.toList());
        System.out.println(list2); // [3, 4, 5, 2]
    }
}