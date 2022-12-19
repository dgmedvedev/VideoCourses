package VideoCourse_02.Lessons.lesson09_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3MetaSymbols {
    public static void main(String[] args) {
        String s = "DABD5KP ABE7KP !=4DABAB? abc!!! deg&&&";

        Pattern pattern1 = Pattern.compile("\\d"); // - любая цифра от 0 до 9
        Pattern pattern2 = Pattern.compile("\\D"); // - любая НЕ цифра
        Pattern pattern3 = Pattern.compile("\\w"); // - любая буква, цифра или знак _ (т.е. все, кроме пробела,!=+-...)
        Pattern pattern4 = Pattern.compile("\\W"); // - любая НЕ буква, НЕ цифра или НЕ знак _
        Pattern pattern5 = Pattern.compile("\\w\\s+\\w"); // s - пробельный символ, заменяет набор символов [\t\n\r\f]
        // t - TAB
        // n, r - начало новой строки
        // f - form fit, окончание страницы
        Pattern pattern6 = Pattern.compile("\\D{2,6}"); // D - не цифра, кол-во повторений от 2 до 6
        Pattern pattern7 = Pattern.compile("\\D{2,}"); // D - не цифра, кол-во повторений от 2 до 6
        Pattern pattern8 = Pattern.compile("D(AB){2,}"); // DABABDABABABAB
        Pattern pattern9 = Pattern.compile("D(AB)?"); // ? - ноль или одно повторение
        Pattern pattern10 = Pattern.compile("D(AB)*"); // * - ноль или большее количество повторений
        Pattern pattern11 = Pattern.compile("\\ADAB"); // A - соответствует выражению вначале String, Z - в конце
        Pattern pattern12 = Pattern.compile("[B-F][G-K3-8]"); // A - соответствует выражению вначале String, Z - в конце

        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);
        Matcher matcher3 = pattern3.matcher(s);
        Matcher matcher4 = pattern4.matcher(s);
        Matcher matcher5 = pattern5.matcher(s);
        Matcher matcher6 = pattern6.matcher(s);
        Matcher matcher7 = pattern7.matcher(s);
        Matcher matcher8 = pattern8.matcher(s);
        Matcher matcher9 = pattern9.matcher(s);
        Matcher matcher10 = pattern10.matcher(s);
        Matcher matcher11 = pattern11.matcher(s);
        Matcher matcher12 = pattern12.matcher(s);

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
        while (matcher5.find()) {
            System.out.println("Position5: " + matcher5.start() + "     " + matcher5.group());
        }
        System.out.println("-------------------------");
        while (matcher6.find()) {
            System.out.println("Position6: " + matcher6.start() + "     " + matcher6.group());
        }
        System.out.println("-------------------------");
        while (matcher7.find()) {
            System.out.println("Position7: " + matcher7.start() + "     " + matcher7.group());
        }
        System.out.println("-------------------------");
        while (matcher8.find()) {
            System.out.println("Position8: " + matcher8.start() + "     " + matcher8.group());
        }
        System.out.println("-------------------------");
        while (matcher9.find()) {
            System.out.println("Position9: " + matcher9.start() + "     " + matcher9.group());
        }
        System.out.println("-------------------------");
        while (matcher10.find()) {
            System.out.println("Position10: " + matcher10.start() + "     " + matcher10.group());
        }
        System.out.println("-------------------------");
        while (matcher11.find()) {
            System.out.println("Position11: " + matcher11.start() + "     " + matcher11.group());
        }
        System.out.println("-------------------------");
        while (matcher12.find()) {
            System.out.println("Position12: " + matcher12.start() + "     " + matcher12.group());
        }
    }
}