package VideoCourse_03.Lessons.lesson08;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}