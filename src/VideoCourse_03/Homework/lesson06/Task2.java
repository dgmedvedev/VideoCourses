package VideoCourse_03.Homework.lesson06;

public class Task2 {
    public static void main(String[] args) {
        method(false, false);
        method(false, true);
        method(true, true);
    }

    static void method(boolean isNight, boolean goodWeather) {
        System.out.print("isNight = " + isNight + ", goodWeather = " + goodWeather + " - ");
        if (isNight) {
            System.out.println("Спать");
        }
        if (!isNight && goodWeather) {
            System.out.println("Гулять");
        }
        if (!isNight && !goodWeather) {
            System.out.println("Читать");
        }
    }
}