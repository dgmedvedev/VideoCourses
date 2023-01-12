package VideoCourse_03.Homework.lesson24;

public class Accountant implements Counter {
    @Override
    public String report(int numberOfMonths) {
        return "Отчет за " + numberOfMonths + " месяцев";
    }
}