package VideoCourse_02.Lessons.lesson02_generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("Hello", 20);
        System.out.println("V1 = " + pair1.getFirstValue() + ", V2 = " + pair1.getSecondValue());
        OtherPair<Double> pair2 = new OtherPair<>(3.14, 20.0);
        System.out.println("V1 = " + pair2.getFirstValue() + ", V2 = " + pair2.getSecondValue());
    }
}

class Pair<V1, V2> {        // 2 place holder (два плейс холдера), V1 и V2
    private V1 value1;      // не может быть static
    private V2 value2;      // не может быть static

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}

class OtherPair<V> {
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) { // 1 place holder (один плейс холдер), но задается 2 значения одного типа
        this.value1 = value1;
        this.value2 = value2;
    }

    public V getFirstValue() {
        return value1;
    }

    public V getSecondValue() {
        return value2;
    }
}