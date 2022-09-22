package VideoCourse_01.Lessons.Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        System.out.println("arrayList = " + arrayList);
        System.out.println();

        List<String> list1 = List.of("odin", "dva", "tri");   // при создании List с помощью List.of(),
        // создается List, который невозможно изменить
        // list1.add("BAD");      // компилятор не ругается, но вылетит UnsupportedOperationException
        System.out.println("list1 = " + list1);
        List<String> list2 = List.copyOf(arrayList);   // copyOf(Collections) - создает копию неизменяемого list2 из arrayList
        System.out.println("list2 = " + list2);

    }
}
