package videoCourse_02.lessons.lesson03_collection.array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("1");
        arrayList1.add("2");
        ArrayList<String> arrayList2 = (ArrayList<String>) arrayList1.clone();

        System.out.println("arrayList1 = " + arrayList1);
        System.out.println("arrayList2 = " + arrayList2);

        System.out.println(arrayList1 == arrayList2);               // false
        System.out.println(arrayList1.get(0) == arrayList2.get(0)); // true

        List<String> list1 = List.of("odin", "dva", "tri");   // при создании List с помощью List.of(),
        // создается List, который невозможно изменить
        // list1.add("BAD");      // компилятор не ругается, но вылетит UnsupportedOperationException
        System.out.println("arrayList1 = " + list1);
        List<String> list2 = List.copyOf(list1);   // copyOf(Collections) - создает копию неизменяемого list2 из list1
        System.out.println("arrayList2 = " + list2);

        System.out.println(list1 == list2);               // true, в отличие от clone()
        System.out.println(list1.get(0) == list2.get(0)); // true
    }
}