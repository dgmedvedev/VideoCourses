package VideoCourse_03.Homework.lesson10;

public class Human {
    public String name;
    public int age;
    public double weight;

    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public static double avgAge(int... age) {
        int sum = 0;
        int count = 0;
        for (int i : age) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h1 = new Human("Ivan", 20, 65);
        Human h2 = new Human("Petr", 25, 70);
        Human h3 = new Human("Mariya", 30, 75);
        Human h4 = new Human("Semen", 35, 80);
        Human h5 = new Human("Sveta", 40, 85);

        double avgAge = Human.avgAge(h1.age, h2.age, h3.age, h4.age, h5.age);
        System.out.println(avgAge);
    }
}