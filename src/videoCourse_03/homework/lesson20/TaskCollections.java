package videoCourse_03.homework.lesson20;

import java.util.ArrayList;

public class TaskCollections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        ArrayList<String> names = new ArrayList<>(10);
        names.add("Dima");
        names.add("Ivan");
        names.add("Oleg");
        names.add("Oksana");
        names.add("Sveta");
        names.add("Alex");
        names.add("Maxim");
        names.add("Denis");
        names.add("Andrey");
        names.add("Mariya");

        ArrayList<String> numbersAndNames = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            numbersAndNames.add(numbers.get(i) + " - " + names.get(i));
            System.out.println(numbersAndNames.get(i));
        }
    }
}