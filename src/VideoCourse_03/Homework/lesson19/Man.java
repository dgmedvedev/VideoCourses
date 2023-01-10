package VideoCourse_03.Homework.lesson19;

public class Man {
    private String name;
    private String position;
    private int age;
    private double height;

    Man() {
    }

    Man(String name, String position, int age, double height) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

class ManTest {
    public static void main(String[] args) {
        String s = "Это Иван, ему 34 года, его рост 166.3 см. Должность - программист";

        String name = s.substring(4, 8);
        String position = s.substring(54, 65);
        String stringAge = s.substring(14, 16);
        int age = Integer.parseInt(stringAge);
        String stringHeight = s.substring(32, 37);
        double height = Double.parseDouble(stringHeight);

        Man man = new Man(name, position, age, height);
        Man man2 = new Man();

        System.out.println(man);
        System.out.println(man2);
    }
}