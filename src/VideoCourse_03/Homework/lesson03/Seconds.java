package VideoCourse_03.Homework.lesson03;

public class Seconds {
    public static void main(String[] args) {
        int seconds = 86_461;
        int secondsInDays = 24 * 60 * 60;

        int days = seconds / secondsInDays;
        int hours = (seconds % secondsInDays) / (24 * 60);
        int minutes = ((seconds % secondsInDays) % (24 * 60)) / 60;
        int leftSeconds = seconds - days * secondsInDays - hours * (24 * 60) - minutes * 60;

        System.out.println("Общее кол-во секунд: " + seconds);
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + leftSeconds);
    }
}