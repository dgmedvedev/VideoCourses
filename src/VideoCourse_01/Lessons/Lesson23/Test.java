package VideoCourse_01.Lessons.Lesson23;

public class Test {
    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test test = new Test();
        Animal animal = new Mouse();
        test.abc(animal);           // A    , т.к. Compile time binding - компилятор определил тип переменной, т.к. animal используется как переменная
        animal.getName();           // Mouse, т.к. Run time binding - основан на типе объекта, который создается
    }
}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal{
    void getName() {
        System.out.println("Mouse");
    }
}