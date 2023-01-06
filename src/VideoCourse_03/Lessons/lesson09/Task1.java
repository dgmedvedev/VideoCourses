package VideoCourse_03.Lessons.lesson09;

public class Task1 {
    public static void main(String[] args) {
        String[] months = {"Янв", "Фев", "Мар", "Апр", "Май", "Июн", "Июл", "Авг", "Сен", "Окт", "Ноя", "Дек"};
        for (int i = 0; i < months.length; i++) {
            if (i != months.length - 1) {
                System.out.print(months[i] + ", ");
            } else {
                System.out.println(months[i] + ".");
            }
        }
    }
}