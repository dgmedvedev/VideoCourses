package VideoCourse_01.Lessons.Lesson24;

public class Test {
    public static void abc(){
        System.out.println("Test1 abc()");
    }

    public static void main(String[] args) {
        Pig pig = new Pig();
        Test test = new Pig();

        pig.abc();
        test.abc();
    }
}

class Pig extends Test{
    public static void abc(){
        System.out.println("Pig abc()");
    }
}