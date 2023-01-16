package videoCourse_01.lessons.lesson16;

public class Test2 {
    public static void main(String[] args) {

        String s1 = new String("privet petr"); // - final private char [] PRIVET = {'p','r','i','v','e','t',' ','p','e','t','r'};
        // s1 не меняется на протяжении всего метода main (String immutable).
        String s2_ = "Privet Petr";

        String s10 = s1.substring(3);   // - присвоение s10 значения s1 начиная с символа 3 (создает new String)
        System.out.println(s10);
        String s11 = s1.substring(3, 8);   // - присвоение s10 значения s1 начиная с символа 3(включая) по 8(не включая)
        System.out.println(s11);

        String s2 = "   privet petr   ";
        String s12 = s2.trim();
        // - убирает пробелы по бокам, но не трогает пробелы в середине строки,
        //   создает new String(""), но только в том случае, если что-то поменялось
        //   если строка осталась неизменной, то создает String str = "...";
        System.out.println("s2 = " + s2);
        System.out.println("s12 = " + s12);

        String s13 = s1.replace('p', 'P');  // - заменяет все символы 'p' на 'P' (создает s13 = new String("");)
        // если указать символ, которого нет в строке, то строка не изменится (создает s13 = "...";)
        System.out.println("s2_ = " + s2_);
        System.out.println("s13 = " + s13);
        System.out.println(s2_==s13);

        String s14 = s1.replace("vet", "vivka");
        System.out.println("s14 = " + s14);

        String s15 = "privet ";
        String s16 = "petr";
        String s17 = s15.concat(s16);           // - объединение строк (создает s17 = new String("...");)
        System.out.println("s17 = " + s17);







        String s3 = new String("privet petr");
        String s4 = "privet petr";
        String s5 = "  privet petr  ";
        String s6 = s4.substring(0, 11);
        String s7_1 = s4.trim();
        String s7_2 = s5.trim();
        String s8_1 = s4.replace('p','p');
        String s8_2 = s4.replace("p","p");
        String s8_3 = s4.replace("pr","pr");
        String s9 = s4.concat("");

        System.out.println("s3==s4 " + (s3 == s4));     // - false
        System.out.println("s3==s5 " + (s3 == s5));     // - false
        System.out.println("s4==s5 " + (s4 == s5));     // - false
        System.out.println("s4==s6 " + (s4 == s6));     // - true
        System.out.println("s4==s7_1 " + (s4 == s7_1));     // - TRUE ,т.к. объект не менялся
        System.out.println("s4==s7_2 " + (s4 == s7_2));     // - FALSE
        System.out.println("s6==s7_2 " + (s6 == s7_2));     // - false
        System.out.println("s4==s8_1 " + (s4==s8_1));   // - true
        System.out.println("s4==s6 " + (s4 == s6));     // - true
        System.out.println("s4==s8_2 " + (s4==s8_2));   // - true
        System.out.println("s4==s8_3 " + (s4==s8_3));   // - false
        System.out.println("s4==s9 " + (s4==s9));

    }
}