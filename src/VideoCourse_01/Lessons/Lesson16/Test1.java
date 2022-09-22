package VideoCourse_01.Lessons.Lesson16;

public class Test1 {
    public static void main(String[] args) {
        int index = 3;

        String s1 = new String("privet petr"); // - final private char [] PRIVET = {'p','r','i','v','e','t',' ','p','e','t','r'};

        int length = s1.length(); // - длина строки (массива символов)
        System.out.println("Длина строки " + s1 + " = " + length);

        char c1 = s1.charAt(index); // - символ по номеру индекса
        System.out.println("Символ строки " + s1 + " под номером индекса " + index + " это " + c1);

        int i1 = s1.indexOf('t'); // - на каком месте находится конкретный символ, если символа нет, то значение (-1)
        System.out.println("i1 = " + i1);
        int i2 = s1.indexOf("t"); // - тоже самое, только параметр String
        System.out.println("i2 = " + i2);
        int i3 = s1.indexOf("vet"); // - с какого индекса начинается строка, если строки нет, то значение (-1)
        System.out.println("i3 = " + i3);
        int i4 = s1.indexOf('p', 3);
        // - на каком месте находится конкретный символ, если начинать поиск с 3-го символа
        System.out.println("i4 = " + i4);
        int i5 = s1.indexOf("p", 3);
        // - тоже самое, только параметр String
        System.out.println("i5 = " + i5);

        boolean b1 = s1.startsWith("pri");       // - начинается ли строка s1 со значения "pri"?
        System.out.println(b1);
        b1 = s1.startsWith("pet", 7); // - начинается ли строка s1 начиная с индекса 7 со значения "pet"?
        System.out.println(b1);

        boolean b2 = s1.endsWith("etr");         // - заканчивается ли строка s1 значением "etr"?
        System.out.println(b2);
    }
}