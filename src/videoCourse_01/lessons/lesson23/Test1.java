package videoCourse_01.lessons.lesson23;

public class Test1 {
    public static void main(String[] args) {
        A1 c1 = new C1(){};
        c1.abc(new B1());
    }
}

class A1{
    void abc(A1 a){             // сработает данный метод, т.к. abc(B1 b1) - это overload методы, а не override
        System.out.println("A");
    }
}

class B1 extends A1{
    void abc(B1 b1){
        System.out.println("B");
    }
}

class C1 extends B1{
    void abc(B1 b1){
        System.out.println("C");
    }
}