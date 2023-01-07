package VideoCourse_03.Homework.lesson11;

public class Dog {
    String name;
    String breed;
    int speed;

    public Dog(String name, String breed, int speed) {
        this.name = name;
        this.breed = breed;
        this.speed = speed;
    }

    void run() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < speed; i++) {
            if (i == speed - 1) {
                sb.append("бегу...");
            } else {
                sb.append("бегу, ");
            }
        }
        System.out.println(sb);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", speed=" + speed +
                '}';
    }
}

class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Jack", "dog", 5);
        dog.run();
        String infoDog = dog.toString();
        System.out.println(infoDog);
    }
}