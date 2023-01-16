package videoCourse_02.lessons.lesson02_generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> infoString = new Info<>("Hello"); // <String> - параметр,  <> - diamond (бриллиант).
        String s = infoString.getValue();
        System.out.println(infoString + "\n" + s);

        Info<Integer> infoInteger = new Info<>(100);
        Integer i = infoInteger.getValue();
        System.out.println(infoInteger + "\n" + i);
    }
}

class Info<T> {      // T (используют обычно) - называется Type Place Holder (хранитель или заполнитель типа)
    // E - когда работают с элементами например ArrayList, (K - работа с ключами, V - с value) - Map
    private T value; // не может быть static

    public Info(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "[{ " + value + " }]";
    }
}