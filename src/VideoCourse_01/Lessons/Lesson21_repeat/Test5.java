package VideoCourse_01.Lessons.Lesson21_repeat;

public class Test5 extends Car {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = sb1.insert(1,"GOOD",0,4);
        System.out.println(sb2);

        sb2.deleteCharAt(0);
        System.out.println(sb2);

        Test5 t = new Test5();
        t.abc(2);
    }

    void abc(int i){
        System.out.println(i);
    }
}

class Car{
    static void abc(){
        System.out.println("Hello");
    }
}