package videoCourse_04.jav.lesson09;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

        int[] array = new int[101];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}