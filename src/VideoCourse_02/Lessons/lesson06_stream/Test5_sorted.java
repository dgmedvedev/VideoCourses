package VideoCourse_02.Lessons.lesson06_stream;

import java.util.Arrays;

public class Test5_sorted {
    public static void main(String[] args) {
        int[]array = {3,8,1,5,9,12,4,21,81,7,18};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));

        int result = Arrays.stream(array).filter(e->e%2==1) // method chaining
                .map(e->{if(e%3==0){e=e/3;}return e;})
                .reduce((a,e)->a+e).getAsInt();
        System.out.println(result);
        // 3 1 5 9 21 81 7
        // 1 1 5 3 7 27 7
        // 51
    }
}