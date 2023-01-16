package videoCourse_01.lessons.lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a); // Compile time binding
        System.out.println(an.b); // Animal.b, Compile time binding
        an.abc();   // Run time binding
        an.def();   // Run time binding, но метод не Override, он скрытый (hidden) т.к. static
    }
}

class Animal {
    int a = 5;
    static int b = 10;

    void abc() {
        System.out.println("non-static method Animal");
    }

    static void def() {
        System.out.println("static method Animal");
    }
}

class Tiger extends Animal {
    int a = 15;
    static int b = 20;

    void abc() {
        System.out.println("non-static method Tiger");
    }

    static void def() {
        System.out.println("static method Tiger");
    }
}