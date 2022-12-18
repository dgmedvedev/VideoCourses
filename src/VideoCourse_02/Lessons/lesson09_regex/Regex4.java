package VideoCourse_02.Lessons.lesson09_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
        String s = "ABD5KP ABE7KP !=4AB?";

        Pattern pattern1 = Pattern.compile("\\w+"); // - соответствует одному или большему кол-ву повторений
        Pattern pattern2 = Pattern.compile("\\w{4}"); // - соответствует кол-ву повторений n

        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);

        while (matcher1.find()) {
            System.out.println("Pattern1: " + matcher1.start() + "   " + matcher1.group());
        }
        System.out.println("-------------------------");
        while (matcher2.find()) {
            System.out.println("Pattern5: " + matcher2.start() + "   " + matcher2.group());
        }
        System.out.println("-------------------------");
    }
}