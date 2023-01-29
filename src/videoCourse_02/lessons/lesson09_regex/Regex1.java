package videoCourse_02.lessons.lesson09_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s
                = "Ivanov Vasiliy, Russia, Moscow,Lenin street,51,Flat 48," +
                "email:vivanov@mail.ru,Postcode: AA99,Phone Number: +123456789;" +
                "Petrova Mariya, Belarus, Minsk,Pobeda street,123,Flat 18," +
                "email:masha@tut.by,Postcode: BEL54,Phone Number: +987654321;" +
                "Chuck Norris, USA, Hollywood,All stars street,87,Flat 21," +
                "email:chuck@gmail.com,Postcode: USA23,Phone Number: +136478952.";

        Pattern pattern1 = Pattern.compile("\\b\\d{2}\\b"); // границы до и после нужного выражения
        Pattern pattern2 = Pattern.compile("\\+\\d{9}"); // нахождение номеров телефонов из текста
        Pattern pattern3 = Pattern.compile("\\w+@\\w+\\.(com|ru|by)"); // нахождение email из текста

        Matcher matcher1 = pattern1.matcher(s);
        Matcher matcher2 = pattern2.matcher(s);
        Matcher matcher3 = pattern3.matcher(s);

        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        System.out.println("-------------------------");
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
        System.out.println("-------------------------");
        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }
        System.out.println("-------------------------");
    }
}