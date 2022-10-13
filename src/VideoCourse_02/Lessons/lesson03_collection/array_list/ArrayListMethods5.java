package VideoCourse_02.Lessons.lesson03_collection.array_list;

import java.util.ArrayList;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");

        Object[] array1 = arrayList.toArray();
        String[] array2 = arrayList.toArray(new String[0]);

        for (Object o : array1) {
            System.out.print(o + " ");
        }

        System.out.println();

        for (String s : array2) {
            System.out.print(s + " ");
        }
    }
}