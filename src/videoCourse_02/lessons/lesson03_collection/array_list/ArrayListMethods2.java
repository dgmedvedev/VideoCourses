package videoCourse_02.lessons.lesson03_collection.array_list;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("one");
        arrayList1.add("two");
        arrayList1.add("three");
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);
        arrayList1.addAll(1, arrayList2);
        System.out.println(arrayList1);
        System.out.println(arrayList1.contains("one")); // true, т.к. arrayList1 содержит объект "one" (метод equals переопределен у String)
        arrayList1.clear();
        System.out.println(arrayList1);
        System.out.println(arrayList1.isEmpty()); // true, т.к. arrayList1 пуст
    }
}