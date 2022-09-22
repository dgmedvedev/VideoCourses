package VideoCourse_01.Lessons.Lesson21_repeat;

public class Test2 {
    int abc() {
        return 5;
    }

    void abc2(int i) {
        if (i > 2) {
            return;
            // return можно использовать даже с void и не обязательно в конце метода, также как и с возвращаемым значением
        }
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        System.out.println(new Test2().abc());
    }
}