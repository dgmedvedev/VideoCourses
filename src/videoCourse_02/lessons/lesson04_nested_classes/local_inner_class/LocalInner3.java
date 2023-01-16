package videoCourse_02.lessons.lesson04_nested_classes.local_inner_class;

// в таком случае обычно используются анонимные классы или лямбда-выражения
public class LocalInner3 {
    public static void main(String[] args) {
        class Addition implements Math3 { // local inner class
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        Addition add = new Addition();
        System.out.println(add.doOperation(5, 3));

        Math3 m3 = (a, b) -> a + b + 3; // lambda expression
        System.out.println(m3.doOperation(5, 3));
    }
}

interface Math3 {
    int doOperation(int a, int b);
}