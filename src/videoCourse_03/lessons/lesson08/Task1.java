package videoCourse_03.lessons.lesson08;

public class Task1 {
    public static void main(String[] args) {
        int[] firstArray = new int[901];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 100;
        }
        int[] secondArray = new int[firstArray.length];
        for (int i = 0, j = firstArray.length - 1; i < firstArray.length; i++, j--) {
            secondArray[i] = firstArray[j];
        }

        for (int i : secondArray) {
            System.out.println(i);
        }
    }
}