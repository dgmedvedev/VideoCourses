package videoCourse_02.lessons.lesson09_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String s = "ABD5KP ABE7KP AB7KP AB8KP";

        Pattern pattern1 = Pattern.compile("AB8K"); // - соответствует последовательно идущим символам
        Pattern pattern2 = Pattern.compile("[D78]"); // - соответствие одному любому символу из квадратных скобок
        Pattern pattern3 = Pattern.compile("AB[C-H][3-7]KP"); // - соответствие одному символу из диапазона
        Pattern pattern4 = Pattern.compile("AB[C-H3-7]KP"); // - соответствие одному символу из ДИАПАЗОНОВ
        Pattern pattern5 = Pattern.compile("AB[^C-H3-7]KP"); // - знак ^ - соответствие одному символу, НЕ из ДИАПАЗОНОВ
        Pattern pattern6 = Pattern.compile("AB(D|7)"); // - тритий символд D ИЛИ 7
        Pattern pattern7 = Pattern.compile("AB."); // - любой символ, кроме символа новой строки
        Pattern pattern8 = Pattern.compile("^ABD"); // - знак ^ не в [ ] - сотответствие выражению в начале строки
        Pattern pattern9 = Pattern.compile("8KP$"); // - знак $ - сотответствие выражению в конце строки

        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);
        Matcher matcher3 = pattern3.matcher(s);
        Matcher matcher4 = pattern4.matcher(s);
        Matcher matcher5 = pattern5.matcher(s);
        Matcher matcher6 = pattern6.matcher(s);
        Matcher matcher7 = pattern7.matcher(s);
        Matcher matcher8 = pattern8.matcher(s);
        Matcher matcher9 = pattern9.matcher(s);

        while (matcher1.find()) {
            System.out.println("Position1: " + matcher1.start() + "     " + matcher1.group());
        }
        System.out.println("---------------------------");
        while (matcher2.find()) {
            System.out.println("Position2: " + matcher2.start() + "     " + matcher2.group());
        }
        System.out.println("---------------------------");
        while (matcher3.find()) {
            System.out.println("Position3: " + matcher3.start() + "     " + matcher3.group());
        }
        System.out.println("---------------------------");
        while (matcher4.find()) {
            System.out.println("Position4: " + matcher4.start() + "     " + matcher4.group());
        }
        System.out.println("---------------------------");
        while (matcher5.find()) {
            System.out.println("Position5: " + matcher5.start() + "     " + matcher5.group());
        }
        System.out.println("---------------------------");
        while (matcher6.find()) {
            System.out.println("Position6: " + matcher6.start() + "     " + matcher6.group());
        }
        System.out.println("---------------------------");
        while (matcher7.find()) {
            System.out.println("Position7: " + matcher7.start() + "     " + matcher7.group());
        }
        System.out.println("---------------------------");
        while (matcher8.find()) {
            System.out.println("Position8: " + matcher8.start() + "     " + matcher8.group());
        }
        System.out.println("---------------------------");
        while (matcher9.find()) {
            System.out.println("Position9: " + matcher9.start() + "     " + matcher9.group());
        }
    }
}