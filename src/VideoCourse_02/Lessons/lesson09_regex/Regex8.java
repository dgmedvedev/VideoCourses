package VideoCourse_02.Lessons.lesson09_regex;

import java.util.regex.*;

public class Regex8 {
    public static void main(String[] args) {
        String myString = "12345678901234562903777; 78901234567890121604123; 34567890123456782011150";

        Pattern pattern = Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");
        Matcher matcher = pattern.matcher(myString);

        String myNewString = matcher.replaceAll("$7 $5/$6 $1 $2 $3 $4");
        System.out.println(myNewString);

        matcher = pattern.matcher(myString);

        while (matcher.find()) {
            System.out.println(matcher.group(7));
        }
    }
}