package videoCourse_01.lessons.lesson21_repeat;

public class Test1 {
    public static void main(String[] args) {
        // Ternary operator (Тернарный, тройной оператор)
        // booleanExpression ? expression1 : expression2
        // expression1 если booleanExpression = true
        // expression2 если booleanExpression = false
        int i = (3 > 2) ? 0 : 2;
        System.out.println("i = " + i + ", т.к. условие равно true");
        System.out.println((i >= 1) ? i : "i < 1");
    }
}
