package VideoCourse_02.Lessons.lesson03_collection.array_list;

import java.util.ArrayList;

public class ArrayListMethods6 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        ArrayList<String> list2 = (ArrayList<String>) list1.clone();

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        System.out.println(list1 == list2);               // false
        System.out.println(list1.get(0) == list2.get(0)); // true
    }
}