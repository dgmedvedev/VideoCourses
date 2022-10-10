package VideoCourse_02.Lessons.lesson03_collection.array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Ivan");
        arrayList1.add("Petr");

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Mariya");
        arrayList2.add("Olga");
        System.out.println(arrayList2);

        List<String> arrayList3 = new ArrayList<>();
        System.out.println(arrayList3);

        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);
        System.out.println(arrayList1);
        System.out.println(arrayList4);

        System.out.println(arrayList1 == arrayList4);
    }
}