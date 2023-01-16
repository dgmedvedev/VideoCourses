package videoCourse_02.lessons.lesson04_nested_classes.anonymous_class;

public class AnonymousClass {
    private final int x = 100;

    public static void main(String[] args) {
        Math m1 = new Math() {
            final int c = 10;

            void abc() {
                System.out.println(c);
            }

            @Override
            public int doOperation(int a, int b) {
                AnonymousClass ac = new AnonymousClass();
                abc();
                return a + b + ac.x;
            }
        };

        Math m2 = (a, b) -> a * b; // лямбда выражение - это краткая форма для написания анонимного класса
        System.out.println(m1.doOperation(5, 10));
        System.out.println(m2.doOperation(5, 3));
    }
}

interface Math {
    int doOperation(int a, int b);
}