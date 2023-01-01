package VideoCourse_03.Homework.lesson04;

public class Cash {
    public static void main(String[] args) {
        int cash = 300;

        if (cash > 500) {
            System.out.println("Pizza");
        } else if (cash < 100) {
            System.out.println("Hot dog");
        } else {
            System.out.println("Hamburger");
        }
    }
}