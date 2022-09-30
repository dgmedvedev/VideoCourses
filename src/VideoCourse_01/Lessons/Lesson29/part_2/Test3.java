package VideoCourse_01.Lessons.Lesson29.part_2;

import java.util.List;
import java.util.function.Predicate;

public class Test3 {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "good", "ok", "how are you?");
        String str = "ABC";         // нельзя менять значение или нужно использовать модификатор final
        for (String s : list) {
            Predicate<String> p = z -> {
                System.out.println(str.length());
                return z.length() > 4;
            };
        }
    }
}