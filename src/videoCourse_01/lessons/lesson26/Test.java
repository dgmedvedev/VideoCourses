package videoCourse_01.lessons.lesson26;

public class Test {
    public static void main(String[] args) {
        TestB test = new TestD();
        System.out.println(test.title);
        test.abc();
    }
}

class TestA {
    String title = "t1";
}

class TestB extends TestA {
    String title = "t2";

    void abc() {
        System.out.println("t2");
    }
}

class TestC extends TestB {
    String title = "t3";
}

class TestD extends TestC {
    String title = "t4";

    void abc() {
        System.out.println("t4");
    }
}