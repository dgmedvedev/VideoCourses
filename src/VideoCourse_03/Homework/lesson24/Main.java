package VideoCourse_03.Homework.lesson24;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Accountant accountant = new Accountant();

        String report1 = director.force(accountant, 5);

        String report2 = director.force(new Counter() {
            @Override
            public String report(int numberOfMonths) {
                return "Отчет за " + numberOfMonths + " месяцев";
            }
        }, 7);

        String report3 = director.force((month) -> "Отчет за " + month + " месяцев", 10);

        System.out.println(report1);
        System.out.println(report2);
        System.out.println(report3);
    }
}