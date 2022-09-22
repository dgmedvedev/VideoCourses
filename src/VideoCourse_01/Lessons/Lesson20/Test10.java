package VideoCourse_01.Lessons.Lesson20;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        System.out.println("arrayList = " + arrayList);

        Object[] arrayObj = arrayList.toArray();                // toArray()    создает массив Object из ArrayList
        String[] arrayStr = arrayList.toArray(new String[]{});  // создает массив DataType из ArrayList

        for (Object o : arrayObj) {
            System.out.print(o + " ");
        }
        System.out.println();
        for (String s : arrayStr) {
            System.out.print(s + " ");
        }
    }
}