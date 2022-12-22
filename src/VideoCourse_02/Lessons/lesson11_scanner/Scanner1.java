package VideoCourse_02.Lessons.lesson11_scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // - конструктор для работы с консолью
        System.out.println("Enter string nextLine()");
        String s1 = scanner.nextLine(); // - выводит всю строку. Метод нужно использовать перед nextInt()
        System.out.println("Enter string next()");
        String s2 = scanner.next(); // - выводит часть строки, до 1-го пробела. Потом следующую часть подставляет в scanner и т.д.

        System.out.println("Enter 2 numbers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("x / y = " + x / y);
        System.out.println("x % y = " + x % y);
        System.out.println("You string nextLine() is " + s1);
        System.out.println("You string next() is " + s2);

        scanner = new Scanner("Hello!\nHow are you?\nI am fine!"); // - конструктор со String
        System.out.println(scanner.next().charAt(2)); // - выводит символ по номеру индекса, т.е. 'l'
        while (scanner.hasNext()) { // - сработает ТРИ раза, но Hello все равно не выведет в консоль, т.к. выше использовали
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}