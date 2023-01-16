package videoCourse_01.lessons.lesson27;

public class Test5 {
    static void abc(){              // рекурсия вызовет ошибку. StackOverflowError
        System.out.println("abc");
        abc();
    }

    public static void main(String[] args) {
        abc();
    }
}
