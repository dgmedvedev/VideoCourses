package videoCourse_03.lessons.lesson07;

public class Loop {
    public static void main(String[] args) {
        int sum = 0;
        double avgGrade;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        avgGrade = sum / 100.0;
        System.out.println("sum = " + sum);
        System.out.println(avgGrade);
    }
}