package videoCourse_01.lessons.lesson25;

public class Test5 {
    public static void main(String[] args) {
        Test10 t1 = new Test10();
        Test10 t2 = new Test20();
        Test10 t3 = new Test30();

        System.out.println(t1.a);
        t1.abc();
        System.out.println(t2.a);
        t2.abc();
        System.out.println(t3.a);
        t3.abc();
        System.out.println(((Test30)t3).a);
        ((Test30)t3).def();

    }
}

class Test10 {
    int a = 5;

    void abc() {
        System.out.println("ok1");
    }
}

class Test20 extends Test10 {
    int a = 10;

    void abc() {
        System.out.println("ok2");
    }
}

class Test30 extends Test20 {
    int a = 15;

    void abc() {
        System.out.println("ok3");
    }
    public void def(){
        System.out.println("def");
    }
}