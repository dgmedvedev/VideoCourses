package videoCourse_02.lessons.lesson05_lambda;

public class Test1 {
    static void aBc(I i) {
        System.out.println(i.abc("Hello"));
    }

    static void dEf(Int i) {
        System.out.println(i.def());
    }

    public static void main(String[] args) {
        int i = 5;
        aBc(str -> {
            System.out.println(i);
            return str.length() + i;
        });
        dEf(() -> 33);
    }
}

interface I {
    int abc(String s);
}

interface Int {
    int def();
}