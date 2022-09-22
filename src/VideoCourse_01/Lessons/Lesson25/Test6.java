package VideoCourse_01.Lessons.Lesson25;

public class Test6 {
    public static void main(String[] args) {
        int i = 5;
        long l = 10;
        // i = i*l;    - ошибка компилятора во время кастинга
        i*=l;       // - нет ошибки

        System.out.println("i = " + i);
    }
}
