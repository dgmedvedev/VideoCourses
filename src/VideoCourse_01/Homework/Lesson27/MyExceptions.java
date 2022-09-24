package VideoCourse_01.Homework.Lesson27;

class NotMeatException extends RuntimeException {
    NotMeatException(String message) {
        super(message);
    }
}

class NotWaterException extends Exception {
    NotWaterException(String message) {
        super(message);
    }
}