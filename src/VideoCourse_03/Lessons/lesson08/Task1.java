package VideoCourse_03.Lessons.lesson08;

public class Task1 {
    public static void main(String[] args) {
        int[] firstArray = new int[901];
        for (int i = 100, j = 0; i < 1001; i++, j++) {
            firstArray[j] = i;
        }
        int[] secondArray = new int[firstArray.length];
        for (int i = 1000, j = 1; j <= firstArray.length; i--, j++) {
            secondArray[j - 1] = firstArray[firstArray.length - j];
        }

        for (int i : secondArray) {
            System.out.println(i);
        }
    }
}