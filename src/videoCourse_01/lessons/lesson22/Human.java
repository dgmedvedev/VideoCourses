package videoCourse_01.lessons.lesson22;

public class Human {
    private StringBuilder name;
    private int age;
    private int weight;
    boolean clever;
    final String SEX;
    public Human(String SEX) {this.SEX = SEX;}
    public Human() {this.SEX = "male";}
    public StringBuilder getName() {                        // getName возвращает копию private StringBuilder name
        StringBuilder name = new StringBuilder(this.name);  // если этого не сделать, то с помощью getName().append("!!!");
        return name;                                        // можно будет изменить private StringBuilder name
    }
    public void setName(StringBuilder name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
    public boolean isClever() {
        return clever;
    }
    public void setClever(boolean clever) {
        this.clever = clever;
    }
    public String toString() {
        return "Name: " + name + "; age: " + age + "; weight: " + weight;
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        h.setName(new StringBuilder("Dima"));
        h.setAge(35);
        h.setWeight(80);
        System.out.println(h);
    }
}

