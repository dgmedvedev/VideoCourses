package VideoCourse_03.Homework.lesson24;

public class Accountant implements Counter {
    @Override
    public String report(int month) {
        return "Отчет за " + month + " месяцев";
    }
}