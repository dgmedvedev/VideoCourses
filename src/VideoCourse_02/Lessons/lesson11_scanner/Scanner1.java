package VideoCourse_02.Lessons.lesson11_scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String s = scanner.nextLine(); // - метод нужно использовать перед nextInt()
        System.out.println("Enter 2 numbers");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("x / y = " + x / y);
        System.out.println("x % y = " + x % y);
        System.out.println("You string is " + s);
    }
}