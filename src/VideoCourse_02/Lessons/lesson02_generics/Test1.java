package VideoCourse_02.Lessons.lesson02_generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(new StringBuilder("Hi"));
        list.add("Hello");
        list.add("OK");
        list.add("Good bye");
        for (String o : list) {
            System.out.println(o + " length = " + o.length());
        }
        System.out.println("-----------------------------");
        // если не параметризировать List, т.е. <String>, то придется писать for следующим образом:
        // и компилятор не будет ругаться на добавление объектов другого типа, но вылетит RuntimeException ClassCast
        for (Object o : list) {
            System.out.println(o + " length = " + ((String) o).length());
        }
    }
}