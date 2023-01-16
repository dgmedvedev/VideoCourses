package videoCourse_02.lessons.lesson11_scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Scanner2 {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        try (Scanner scanner = new Scanner(new FileReader(("C:\\Java\\text.txt")))) {
            scanner.useDelimiter("\\W"); // - разделитель, любой символ не соответствующий букве, цифре или _
            while (scanner.hasNext()) {
                String word = scanner.next();
                set.add(word);
            }
            for (String word : set) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}