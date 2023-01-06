package VideoCourse_03.Homework.lesson09;

public class Task1 {
    public static void main(String[] args) {
        seasons("January");
        seasons("March");
        seasons("12");
    }
    static void seasons(String month){
        switch (month){
            case "December","January","February" -> System.out.println("winter");
            case "March","April","May" -> System.out.println("spring");
            case "June","July","August" -> System.out.println("summer");
            case "September","October","November" -> System.out.println("autumn");
            default -> System.out.println("There is no such month");
        }
    }
}