package VideoCourse_02.Lessons.lesson09_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3MetaSymbols {
    public static void main(String[] args) {
        String s = "ABD5KP ABE7KP !=4AB?";

        Pattern pattern1 = Pattern.compile("\\d"); // - любая цифра от 0 до 9
        Pattern pattern2 = Pattern.compile("\\D"); // - любая НЕ цифра
        Pattern pattern3 = Pattern.compile("\\w"); // - любая буква, цифра или знак _ (т.е. все, кроме пробела,!=+-...)
        Pattern pattern4 = Pattern.compile("\\W"); // - любая НЕ буква, НЕ цифра или НЕ знак _

        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);
        Matcher matcher3 = pattern3.matcher(s);
        Matcher matcher4 = pattern4.matcher(s);

        while (matcher1.find()) {
            System.out.println("Pattern1: " + matcher1.start() + "   " + matcher1.group());
        }
        System.out.println("-------------------------");
        while (matcher2.find()) {
            System.out.println("Pattern2: " + matcher2.start() + "   " + matcher2.group());
        }
        System.out.println("-------------------------");
        while (matcher3.find()) {
            System.out.println("Pattern3: " + matcher3.start() + "   " + matcher3.group());
        }
        System.out.println("-------------------------");
        while (matcher4.find()) {
            System.out.println("Pattern4: " + matcher4.start() + "   " + matcher4.group());
        }
        System.out.println("-------------------------");
    }
}