package VideoCourse_01.Lessons.Lesson31;

public class Test1 {
    public static void main(String[] args) {
        Info<String> infoString = new Info<>("Hello");
        String s = infoString.getValue();
        System.out.println(infoString);
        System.out.println(s);

        Info<Integer> infoInteger = new Info<>(100);
        Integer i = infoInteger.getValue();
        System.out.println(infoInteger);
        System.out.println(i);
    }
}

class Info<T>{          // T - называется Type Place Holder (хранитель или заполнитель типа)
    private T value;
    public Info(T value){
        this.value = value;
    }
    public String toString(){
        return "[{ " + value + " }]";
    }

    public T getValue(){
        return value;
    }
}