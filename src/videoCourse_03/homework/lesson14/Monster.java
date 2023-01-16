package videoCourse_03.homework.lesson14;

public class Monster {
    int eyes;
    int legs;
    int hands;

    Monster(int eyes, int legs, int hands) {
        this.eyes = eyes;
        this.legs = legs;
        this.hands = hands;
    }

    Monster(int eyes, int legs) {
        this(eyes, legs, 2);
    }

    Monster(int eyes) {
        this(eyes, 2, 2);
    }

    Monster() {
        this(2, 2, 2);
    }

    void voice() {
        System.out.println("Голос");
    }

    void voice(int i, String word) {
        for (int j = 0; j < i; j++) {
            System.out.println(word);
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "eyes=" + eyes +
                ", legs=" + legs +
                ", hands=" + hands +
                '}';
    }
}

class MonsterTest {
    public static void main(String[] args) {
        Monster monster0 = new Monster();
        Monster monster1 = new Monster(3);
        Monster monster2 = new Monster(3, 4);
        Monster monster3 = new Monster(4, 8, 4);

        monster0.voice();
        System.out.println("----------------");
        System.out.println(monster1);
        System.out.println("----------------");
        System.out.println(monster2);
        System.out.println("----------------");
        monster3.voice(1, "Boo");
        System.out.println("----------------");
        monster3.voice(2, "Boo-Ga-Ga");
    }
}