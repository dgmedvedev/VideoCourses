package VideoCourse_02.Lessons.lesson05_lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc("Hello"));
    }

    public static void main(String[] args) {
        def(str -> str.length() + 5);
    }
}

interface I{
    int abc(String s);
}