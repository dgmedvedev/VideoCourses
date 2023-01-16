package videoCourse_01.homework.lesson27;

public class Lesson27 {
    public static void main(String[] args) {
        String meal = "meat";
        Tiger tiger = new Tiger();
        tiger.eat(meal);
        try {
            tiger.drink("water");
            try {
                tiger.drink("beer");
            } catch (NotWaterException e) {
                System.out.println("Inner NotWaterException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Inner Exception: " + e.getMessage());
            } finally {
                System.out.println("Inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println("Outer RuntimeException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Outer Exception: " + e.getMessage());
        }
    }
}