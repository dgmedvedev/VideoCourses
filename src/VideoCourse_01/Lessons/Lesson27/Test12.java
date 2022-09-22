package VideoCourse_01.Lessons.Lesson27;

// RuntimeException здесь используются только для примера.
// В работе их не стоит ловить и обрабатывать - это ошибки программиста, их нужно устранять в коде.
public class Test12 {
    void abc() {
        int[] array = {1, 2, 3};
        try {
            System.out.println(array[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = null;
            System.out.println(s.length()); // NullPointerException, т.к. s = null (его поймает только nested catch)
            // И обратная ситуация (Test14), если NullPointerException в nested try или catch не обработан,
            // то его может поймать внешний catch
        } catch (NullPointerException e) {  // но этот catch не поймает NullPointerException, т.к. относится к try
            System.out.println("NullPointerException");
        }
    }

    public static void main(String[] args) {
        Test12 test = new Test12();
        test.abc();
    }
}