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

        double sumResult = list.parallelStream()
                .reduce((accumulator, element) -> accumulator + element).get();
        System.out.println("sumResult = " + sumResult);
    }
}