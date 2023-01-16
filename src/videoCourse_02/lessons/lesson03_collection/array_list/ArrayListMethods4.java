package videoCourse_02.lessons.lesson03_collection.array_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods4 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        List<String> subList = arrayList.subList(1, 3); // создается представление (view) arrayList
        System.out.println("arrayList = " + arrayList);
        System.out.println("subList = " + subList);

        subList.add("A"); // любые изменения subList отразятся в arrayList
        System.out.println("subList = " + subList);
        System.out.println("arrayList = " + arrayList);

        arrayList.add("B"); // но после изменений в arrayList, невозможно будет обратиться к subList
        System.out.println("arrayList = " + arrayList);
        // System.out.println("subList = " + subList); - вылетает исключение ConcurrentModificationException
    }
}