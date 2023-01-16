package videoCourse_01.homework.lesson27;

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