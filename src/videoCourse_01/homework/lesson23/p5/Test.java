package videoCourse_01.homework.lesson23.p5;

class Test {
    public static void main(String[] args) {
        X5 x = new Y5();
        System.out.println(x.s);
        // System.out.println(x.bool);   класс Х5 не видит переменную bool, т.к. она не Hidden (не скрыта)
        // x может ссылаться только на override (переопределенные) методы и hidden переменные класса Y5
    }
}

class X5 {
    String s = "hello";
}

class Y5 extends X5 {
    boolean bool = false;
}