package videoCourse_03.homework.lesson12;

public class Rect {
    int length;
    int width;

    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int getPerimeter() {
        return length + width;
    }

    int getSquare() {
        return length * width;
    }
}

class RectTest {
    public static void main(String[] args) {
        Rect rect = new Rect(10, 15);
        System.out.println(rect.getPerimeter());
        System.out.println(rect.getSquare());
    }
}