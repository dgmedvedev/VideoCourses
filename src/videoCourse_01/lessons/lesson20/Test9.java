package videoCourse_01.lessons.lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.add("four");
        arrayList.add("five");
        System.out.println("arrayList = " + arrayList);

        List<String> list = arrayList.subList(1, 4);     // subList(1,4) метод создает представление (view) arrayList
        // от индекса 1 (включительно) до 4 (не включая). Т.е. любые изменения list отразятся в arrayList.
        // !!! Но после изменения структуры arrayList, невозможно будет работать с list. Вылетит ConcurrentModificationException
        System.out.println("list = " + list);

        list.add("new");
        list.remove("three");
        System.out.println("list = " + list);
        System.out.println("arrayList = " + arrayList);

        arrayList.add("BAD");                           // далее работать с arrayList возможно, но list уже НЕЛЬЗЯ использовать
        System.out.println("arrayList = " + arrayList);
        // System.out.println("list = " + list);        // вылетает ConcurrentModificationException
    }
}
