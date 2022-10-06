package VideoCourse_01.Homework.Lesson08;

public class  Lesson8_2 {
    static final double pI = 3.14;

    double areaCircle(double radius) {
        return pI * radius * radius;
    }

    static double lengthCircle(double radius) {
        return 2 * pI * radius;
    }

    void showInfo(double radius) {
        System.out.println("Радиус = " + radius);
        System.out.println("Площадь круга = " + areaCircle(radius));
        System.out.println("Длина окружности = " + lengthCircle(radius));
    }
}

class Lesson8_2Test {
    public static void main(String[] args) {
        double radius = 33.3;

        System.out.println("Length circle = " + Lesson8_2.lengthCircle(radius));

        Lesson8_2 test = new Lesson8_2();
        System.out.println("Area circle = " + test.areaCircle(radius));

        test.showInfo(radius);
    }
}