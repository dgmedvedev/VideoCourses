package videoCourse_01.lessons.lesson30;

public class Test1 {

    Test1 abc(Test1 t) {
        t = null;
        return t;
    }

    public static void main(String[] args) {
        Byte b = 10;

        Test1 t1 = new Test1();
        Test1 t2 = new Test1();

        t1.abc(t2);
        System.out.println(b);
    }
}