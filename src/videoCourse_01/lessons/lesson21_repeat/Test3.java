package videoCourse_01.lessons.lesson21_repeat;

public class Test3 {
    public static void main(String[] args) {
        int a = 7;
        // вложенные (nested) тернарные операторы
        System.out.println(a > 2 ? a < 5 ? 3 : 6 : 9);                  // 6
        System.out.println(a > 2 ? a > 5 ? a == 7 ? 3 : 6 : 9 : 7);     // 3
    }
}

