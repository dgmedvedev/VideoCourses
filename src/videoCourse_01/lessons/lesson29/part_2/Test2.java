package videoCourse_01.lessons.lesson29.part_2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "good", "ok", "how are you?");
//        for (String s : list) {
//            System.out.println(s);
//        }
        list.forEach(s -> System.out.println(s));
        list.forEach(System.out::println);          // еще более упрощенное лямбда-выражение для метода forEach


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(7);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(6);
        System.out.println("Before sort: " + arrayList);
        arrayList.sort((x, y) -> x.compareTo(y));
        arrayList.sort(Integer::compareTo);         // еще более упрощенное лямбда-выражение для метода sort()
        System.out.println("After sort: " + arrayList);
        arrayList.removeIf(i -> i % 3 == 0);
        System.out.println(arrayList);
    }
}