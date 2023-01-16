package videoCourse_02.lessons.lesson03_collection.vector;

import java.util.Stack;

// Stack - устаревший synchronized класс (является подклассом Vector), не рекомендуется к использованию
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Ivan");
        stack.push("Petr");
        stack.push("Oleg");
        stack.push("Katya");
        System.out.println(stack);
        System.out.println(stack.pop()); // возвращает элемент, который находится на верху стека и сразу его удаляет
        System.out.println(stack);
        System.out.println(stack.peek()); // возвращает элемент, который находится на верху стека, но не удаляет его
        System.out.println(stack);

        while (!stack.isEmpty()) {//если не выполнить проверку, а стек пуст, и вызвать метод pop() или peek(), то вылетит Exception
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}