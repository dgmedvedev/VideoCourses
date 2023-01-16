package videoCourse_03.homework.lesson06;

public class Pifagor {
    static void hypotenuse(double a, double b) {
        System.out.println("Гипотенуза = " + Math.sqrt(a * a + b * b));
    }

    public static void main(String[] args) {
        hypotenuse(32, 40);
        hypotenuse(3, 4);
    }
}