package videoCourse_01.lessons.lesson16;

public class Test8 {
    public static void main(String[] args) {
        String s1 = "   ";
        System.out.println(s1.isBlank()); // - возвращает true, если s1 содержит пробелы или Tab (" ", "    ")
        String s2 = "hello";
        System.out.println(s2.isBlank()); // - возвращает false

        String s3 = "";
        System.out.println(s3.isEmpty()); // - возвращает true, только если s3 пустая ("")
        String s4 = " ";
        System.out.println(s4.isEmpty()); // - возвращает false

        String s5 = null;                   // - создается пустая ссылка, которая не указывает ни на какой объект
        System.out.println(s5);             // - результат на экране "null". не смотря на это методы с ним не работают
        //System.out.println(s5.isEmpty()); // - NullPointerException

        String s6 = "     Hel  lo     ";
        System.out.println(s6.strip());
        System.out.println(s6.stripLeading());
        System.out.println(s6.stripTrailing());

    }
}