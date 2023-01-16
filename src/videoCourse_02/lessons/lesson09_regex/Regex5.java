package videoCourse_02.lessons.lesson09_regex;

import java.util.Arrays;

public class Regex5 {
    public static void main(String[] args) {
        String s1
                = "Ivanov Vasiliy, Russia, Moscow,Lenin street,51,Flat 48," +
                "email:vivanov@mail.ru,Postcode: AA99,Phone Number: +123456789;" +
                "Petrova Mariya, Belarus, Minsk,Pobeda street,123,Flat 18," +
                "email:masha@tut.by,Postcode: BEL54,Phone Number: +987654321;" +
                "Chuck Norris, USA, Hollywood,All stars street,87,Flat 21," +
                "email:chuck@gmail.com,Postcode: USA23,Phone Number: +136478952.";
        String s2 = "chuck@gmail.com";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)"); // сравнивает String с regex
        System.out.println(result);

        String[] array = s1.split(" "); // в параметре указываем тот regex, который выступает в роли разделителя
        System.out.println(Arrays.toString(array));
    }
}