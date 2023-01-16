package videoCourse_02.lessons.lesson03_collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        // задача на проверку, является ли String полиндромом
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator(); // начинает итерацию с нулевого индекса
        ListIterator<Character> reverseIterator = list.listIterator(list.size());// начинает итерацию с посл. индекса

        boolean isPalindrome = true;

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT Palindrome");
        }
    }
}