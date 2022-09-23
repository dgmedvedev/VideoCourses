package VideoCourse_01.Lessons.Lesson27;

public class Test15 {
    void marathon(int temperatureAir, int speedRun) throws LegCrampedException {
        if (speedRun > 12) {
            throw new LegCrampedException("(speedRun > 12) = " + speedRun);
        }
        if (temperatureAir > 32) {
            throw new MuscleCrampedException();
        }
        System.out.println("You've run a marathon!");
    }

    public static void main(String[] args) {
        Test15 test = new Test15();
        try {
            int temperatureAir = 20;
            int speedRun = 10;
            test.marathon(temperatureAir, speedRun);
        } catch (LegCrampedException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("You were awarded a diploma!");
        }
    }
}

class LegCrampedException extends Exception {
    LegCrampedException() {
    }

    LegCrampedException(String message) {
        super(message);
    }
}

class MuscleCrampedException extends RuntimeException {
    MuscleCrampedException() {
    }

    MuscleCrampedException(String message) {
        super(message);
    }
}