package videoCourse_01.homework.lesson06;

public class MethodsOverloaded {
    int sum() {
        int result = 0;
        System.out.println(result);
        return 0;
    }

    int sum(int a) {
        System.out.println("sum = " + a);
        return a;
    }

    int sum(int a, int b) {
        int result = a + b;
        System.out.println("sum = " + result);
        return result;
    }

    int sum(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("sum = " + result);
        return result;
    }

    int sum(int a, int b, int c, int d) {
        int result = a + b + c + d;
        System.out.println("sum = " + result);
        return result;
    }
}