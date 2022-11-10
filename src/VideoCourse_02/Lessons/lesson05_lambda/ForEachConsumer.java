package VideoCourse_02.Lessons.lesson05_lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachConsumer {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "ok", "good", "bad");
        for(String str : list){
            System.out.print(str + " ");
            str = "!!!";
            System.out.println(str);
        }
        list.forEach(str -> System.out.print(str + " "));
        System.out.println();

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(5);
        listInt.forEach(i -> {
            System.out.print(i + " ");
            i *= 2;
            System.out.println(i);
        });
        System.out.println(listInt);
    }
}