package videoCourse_02.lessons.lesson03_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        Iterator<String> iterator = arrayList.iterator();

        System.out.println("Before: " + arrayList);

        while (iterator.hasNext()) {
            iterator.next(); // - получение элемента "one"
            iterator.next(); // - получение элемента "two"
            System.out.println("Вывод элемента в консоль: " + iterator.next()); //-получение элемента и вывод в консоль
            iterator.remove(); // - удаление элемента "three"
        }

        System.out.println("After: " + arrayList);
    }
}