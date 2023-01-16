package videoCourse_01.lessons.lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("Good"));
        list.add(new StringBuilder("bye"));
        System.out.println(list);
        System.out.println(list.indexOf("Hello"));
        System.out.println("Значение равно -1 (индекс не найден) т.к. StringBuilder не имеет переопределенного метода equals" +
                " и сравнивает лишь ссылки на разные объекты");
        System.out.println();

        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("Hello");
        listStr.add("Good");
        listStr.add("bye");
        System.out.println(listStr);
        System.out.println(listStr.indexOf("Hello"));
        System.out.println("Значение равно 0 (индекс найден) т.к. String имеет переопределенный метод equals" +
                " и сравнивает объекты по значению");
    }
}