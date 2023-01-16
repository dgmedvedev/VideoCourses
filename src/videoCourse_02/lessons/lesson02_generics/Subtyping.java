package videoCourse_02.lessons.lesson02_generics;

public class Subtyping {
    public static void main(String[] args) {
        // InfoSubtyping<String> infoString = new InfoSubtyping<>("Hello"); - вылетит Error

        InfoSubtyping<Integer> infoInteger = new InfoSubtyping<>(100);
        Integer i = infoInteger.getValue();
        System.out.println(infoInteger + "\n" + i);

        InfoSubtyping<Double> infoDouble = new InfoSubtyping<>(100.0);
        Double d = infoDouble.getValue();
        System.out.println(infoDouble + "\n" + d);
    }
}
//class InfoSubtyping<T extends Number & Interface1 & Interface2> // ограничение до наследников Number и Interface1 и 2
class InfoSubtyping<T extends Number> {      // <T extends Number> ограничение типов классов до наследников Number
    private T value; // не может быть static

    public InfoSubtyping(T value) {
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