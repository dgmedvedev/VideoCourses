package VideoCourse_01.Homework.Lesson8;

public class Lesson8_1 {
    static int umnozhenie(int x, int y, int z) {
        return x * y * z;
    }

    static void delenie(int x, int y) {
        System.out.println("Целое частное при делении " + x + " на " + y + " = " + x / y);
        System.out.println("Остаток от деления " + x + " на " + y + " = " + x % y);
    }
}

class Lesson8_1Test {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, e = 5;
        System.out.println(a + " * " + b + " * " + d + " = " + Lesson8_1.umnozhenie(a, b, d));
        Lesson8_1.delenie(e, c);
    }
}