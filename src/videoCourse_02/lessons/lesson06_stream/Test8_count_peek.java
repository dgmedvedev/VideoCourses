package videoCourse_02.lessons.lesson06_stream;

import java.util.stream.Stream;

public class Test8_count_peek {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        // System.out.println(stream.count()); - stream после обработки нельзя переиспользовать, вылетит Exception
        System.out.println(stream1.distinct().count()); // - количество уникальных элементов (возвращает long)
        System.out.println("---------------");

        Stream<Integer> stream2 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
        System.out.println(stream2.distinct().peek(System.out::println).count());
    }
}