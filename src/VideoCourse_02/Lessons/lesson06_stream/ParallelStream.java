package VideoCourse_02.Lessons.lesson06_stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    // 1 2 3 4 ... 1.000.000.000
    // 1    250.000.000
    // 250.000.001  500.000.000
    // 500.000.001  750.000.000
    // 750.000.001  1.000.000.000
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);
        // (10/5) = 2       1-ый поток
        // (1/0.25) = 4     2-ой поток
        // 2/4 = 0.5        ошибка

        double sumResult = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("sumResult = " + sumResult);

        double divisionResult = list.stream()
                .reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("divisionResult = " + divisionResult); // 8.0
        double divisionResultError = list.parallelStream()
                .reduce((accumulator, element) -> accumulator / element).get();
        System.out.println("divisionResultError = " + divisionResultError); // 0.5 (ошибка)
    }
}