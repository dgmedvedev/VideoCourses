package videoCourse_01.lessons.lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
        list1.add("List1");

        List<Object> list2 = new ArrayList<>();
        list2.add("List2");
        list2.add("List2");
        list2.add("List2");

        Car c = new Car();
        list1.add(c);

        Student s = new Student();
        list1.add(s);

        list1.add(new int[]{1, 2, 3});

        list1.add(new StringBuilder("ok"));

        list1.add(list2);

        for (Object o : list1) {
            System.out.println(o + " ");
        }
        System.out.println("Метод toString list1: " + list1);

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("List3");
        // list2.add(s); - ошибка типизации, т.к. list2 может хранить в себе только String
        for (Object o : list3) {
            System.out.println(o + " ");
        }
    }
}

class Car {
}

class Student {
}

