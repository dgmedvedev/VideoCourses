package VideoCourse_01.Lessons.Lesson29.part_2;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //TestInferenceType tit = new TestInferenceType();
        // var может быть только локальной переменной
        // нельзя использовать var, как аргумент метода
        // var обязательно нужно инициализировать и не может быть равен null
        // при инициализации массива нужно указать тип (не верно: var array = {1,2,3}; не верно var [] array)
        // нельзя использовать var как тип возвращаемого значения
        var tit = new TestInferenceType(); // Локальная переменная var типа inference (с англ. делать вывод)
        var i = 10;
        var f = 1.5f;
        var array = new String[]{"a", "b"};
        var result = abc();
        Object obj1 = "hello";
        var obj2 = obj1; // т.к. obj1 имеет тип Object, то и obj2 будет тоже Object
        ArrayList<String> list1 = new ArrayList<>();
        for (var s : list1) {
            System.out.println(s);
        }
    }

    static double abc() {
        return 3.14;
    }
}

class TestInferenceType {
}