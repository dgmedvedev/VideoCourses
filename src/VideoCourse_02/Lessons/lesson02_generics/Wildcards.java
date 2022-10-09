package VideoCourse_02.Lessons.lesson02_generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<?> l1 = new ArrayList<String>();// - нет ошибки, но нельзя добавлять объекты,<?> - это wildcard (любой тип)
        List<? extends Number> l2 = new ArrayList<Double>();// - - нет ошибки, но нельзя добавлять объекты.
        //Но l2 можно использовать например в параметре метода, который считает сумму всех элементов.
        List<? super Number> l3 = new ArrayList<Object>();// - нет ошибки, можно добавлять объекты.
        //Но только Number или super класса

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("hello");
        showListInfo(list2);

        ArrayList<Double> arrayList1 = new ArrayList<>();
        arrayList1.add(3.14);
        arrayList1.add(3.15);
        System.out.println("-----------------------------------");
        showListInfo(arrayList1);
        System.out.println("sum arrayList1 = " + sum(arrayList1));
    }

    static void showListInfo(List<?> list) {
        System.out.println("This is my list: " + list);
    }

    static double sum(ArrayList<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }
}