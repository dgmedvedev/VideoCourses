package videoCourse_03.homework.lesson24;

public class Accountant implements Counter {
    @Override
    public String report(int numberOfMonths) {
        return "Отчет за " + numberOfMonths + " месяцев";
    }
}