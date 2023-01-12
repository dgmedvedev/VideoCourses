package VideoCourse_03.Homework.lesson25;

public class ExceptionEx {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        try {
            int i = array[array.length];
            System.out.println(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
    }
}