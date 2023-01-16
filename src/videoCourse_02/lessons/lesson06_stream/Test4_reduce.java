package videoCourse_02.lessons.lesson06_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Test4_reduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result1 = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result1);
        // list = [5, 8, 2, 4, 3]
        // accumulator = 5  40  80  320 {960} - Optional оборачивает окончательное значение (может содержать null)
        // element     = 8  2   4   3

        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result2);
        // 1 - это первое значение по умолчанию для accumulator, поэтому get() можно не использовать,
        // т.к. null в таком случае не возможен, result2 будет = 1, даже если все значения будут = null
        // 5, 8, 2, 4, 3
        // accumulator = 1  5  40   80  320 {960} - Optional оборачивает окончательное значение (может содержать null)
        // element     = 5  8   2   4   3
        // чтобы предворительно проверить значение Optional на null, перед вызовом get(), есть метод isPresent()

        List<String> list3 = new ArrayList<>();
        list3.add("hello");
        list3.add("ok");
        list3.add("good");
        list3.add("bad");

        String result3 = list3.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(result3);

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((accumulator, element) -> accumulator * element);
        if (o.isPresent()) {
            System.out.println(o.get());
        } else {
            System.out.println("Not present");
        }
    }
}