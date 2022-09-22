package VideoCourse_01.Lessons.Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figure figure = new Square(15);
        System.out.println(figure.countSide);
        figure.perimeter();
        figure.area();

        Square square = new Square(10);
        System.out.println(square.countSide);
    }
}

abstract class Figure {
    Figure(int countSide) {         // у абстрактного класса есть конструктор
        this.countSide = countSide;
    }

    int countSide;

    abstract void perimeter();

    abstract void area();

    void showInfo() {
        System.out.println("This is Figure ");
    }
}

class Square extends Figure {

    Square(int side) {
        super(4);
        this.side = side;
    }

    int countSide = 4;
    int side;

    @Override
    void perimeter() {
        System.out.println("Perimeter = " + countSide * side);
    }

    @Override
    void area() {
        System.out.println("Area = " + side * side);
    }
}

//class Circle extends Figure {
//}