package videoCourse_01.lessons.lesson20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6_1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);

        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
        // System.out.println(list1.get(0) == list2.get(0));        true, здесь сравниваются значения элементов, а не ссылки на объект
        list1.get(0).append("!!!");
        System.out.println(list2.get(0)); // list2 изменяется также как и list1, т.к. работают со значением на которое ссылаются list1 и list2

        list1.set(0, new StringBuilder("D"));
        System.out.println(list2.get(0)); // list2 здесь не изменится, т.к. list1 создает новый объект под индексом 0, а list2 все еще ссылается на старый объект

        StringBuilder[] array = {sb2, sb3, sb3, sb3};
        List<StringBuilder> list = Arrays.asList(array); // list здесь напрямую связан с array. любые изменения array отразятся в list
        System.out.println(list);
        array[0] = new StringBuilder("!!!"); // в отличие от методов clone() и toArray, здесь значение ИЗМЕНИТСЯ
        System.out.println(list);


    }
}
