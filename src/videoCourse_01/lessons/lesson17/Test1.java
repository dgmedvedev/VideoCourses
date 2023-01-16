package videoCourse_01.lessons.lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        Car car = new Car();

        sb1.append(car);
        sb2.append('1').append("2").append(car);

        System.out.println(sb1.length());
        System.out.println(sb1);

        System.out.println();

        System.out.println(sb2.length());
        System.out.println(sb2);
    }
}

class Car {
    public Car() {
    }

}