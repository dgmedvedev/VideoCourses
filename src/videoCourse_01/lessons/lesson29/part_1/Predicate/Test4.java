package videoCourse_01.lessons.lesson29.part_1.Predicate;

public class Test4 {
    static void dev(Test5 t) {
        System.out.println(t.abc("hello"));
    }

    public static void main(String[] args) {
        dev(s -> s.length());
    }
}

interface Test5 {
    int abc(String s);
}