package videoCourse_02.lessons.lesson06_stream;

import java.util.stream.Stream;

public class Test7_concat_distinct {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        // concat() возвращает stream, но не может быть использован в цепочке
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);
        System.out.println("--------------");

        Stream<Integer> stream4 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        stream4.distinct().forEach(System.out::println);
    }
}