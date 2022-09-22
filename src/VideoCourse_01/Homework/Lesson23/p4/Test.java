package VideoCourse_01.Homework.Lesson23.p4;

public class Test {
    public static void abc(X4 x, Y4 y) {
        System.out.println("Privet");
    }

    public static void abc(X4 x) {
        System.out.println("Privet");
    }

    public static void abc(Y4 y, X4 x) {
        System.out.println("Poka");
    }

    public static void abc(Y4 y) {
        System.out.println("Poka");
    }

    public static void main(String[] args) {
        X4 a = new Y4();
        // abc(a, a);   Ошибка компиляции - Ambiguous method call(Неоднозначный вызов метода).
        abc(a);  // Poka    , т.к. во время выполнения Compile Time Binding обращается внимание именно на тип переменной
    }
}

class X4 {
}

class Y4 extends X4 {
}