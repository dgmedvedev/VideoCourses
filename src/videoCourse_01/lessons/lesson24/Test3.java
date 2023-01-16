package videoCourse_01.lessons.lesson24;

public class Test3 {
}

class Employee {

    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Ест");
    }

    void sleep() {
        System.out.println("Спит");
    }
}

class Teacher extends Employee implements Help_able {
    int numberOfStudents;

    void teaches() {
        System.out.println("Учит студентов");
    }

    @Override
    public void firstHelp() {
        System.out.println("Учитель оказывает помощь");
    }

    @Override
    public void outFire() {
        System.out.println("Учитель тушит пожар");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String modelCar;

    void drive() {
        System.out.println("Водит авто");
    }

    @Override
    public void firstHelp() {
        System.out.println("Водитель оказывает помощь");
    }

    @Override
    public void outFire() {
        System.out.println("Водитель тушит пожар");
    }

    @Override
    public void swim() {
        System.out.println("Водитель плавает");
    }
}

// пришло распоряжение, что Teacher и Driver должны научиться оказывать медпомощь и тушить пожар
// а Driver должен уметь еще и плавать

interface Help_able {        // интерфейс может содержать в себе ТОЛЬКО абстрактные методы, обычных содержать не может
    public abstract void firstHelp();       // в интерфейсе не обязательно применять модификаторы public abstract к методу

    void outFire();
}

interface Swim_able {
    void swim();
}