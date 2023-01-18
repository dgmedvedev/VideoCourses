package videoCourse_04.jav.lesson06;

public class Seasons {
    public static void main(String[] args) {
        String month = "April";
        String season;

        switch (month) {
            case "March", "April", "May" -> season = "spring";
            case "June", "July", "August" -> season = "summer";
            case "September", "October", "November" -> season = "autumn";
            case "December", "January", "February" -> season = "winter";
            default -> season = "Не найдено!";
        }
        System.out.println(season);
    }
}