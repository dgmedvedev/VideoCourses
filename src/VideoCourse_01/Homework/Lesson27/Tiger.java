package VideoCourse_01.Homework.Lesson27;

public class Tiger {
    void eat(String meal) {
        if (meal.equals("meat")) {
            System.out.println("The Tiger eats meat");
        } else {
            throw new NotMeatException("The Tiger doesn't eat " + meal);
        }
    }

    void drink(String liquid) throws NotWaterException {
        if (liquid.equals("water")) {
            System.out.println("The Tiger drink water");
        } else {
            throw new NotWaterException("The Tiger doesn't drink " + liquid);
        }
    }
}