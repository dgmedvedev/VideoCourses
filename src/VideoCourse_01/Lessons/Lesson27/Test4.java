package VideoCourse_01.Lessons.Lesson27;

public class Test4 {
    public static void main(String[] args) {
        int[]array = {2,4,6};
        System.out.println("hello array");

        try {
            System.out.println(array[5]);
            System.out.println("Good day!");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("catch Exception " + e);
        } finally {
            System.out.println("finally");
        }

        System.out.println("print");
    }
}