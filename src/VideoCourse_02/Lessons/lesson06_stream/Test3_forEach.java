package VideoCourse_02.Lessons.lesson06_stream;

import java.util.Arrays;

public class Test3_forEach {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(el -> {
            el *= 2;
            System.out.print(el + " ");
        });
        System.out.println();

        System.out.println(Arrays.toString(array));

        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        System.out.println("----------------");

        Arrays.stream(array).forEach(Utils::myMethod);
    }
}

class Utils {
    public static void myMethod(int a) {
        a += 5;
        System.out.println("Element " + a);
    }
}