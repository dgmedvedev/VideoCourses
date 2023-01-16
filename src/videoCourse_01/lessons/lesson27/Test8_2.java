package videoCourse_01.lessons.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8_2 {
    static int a = 5;

    static int abc() {
        try {
            File file = new File("testFile1.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Exception");
            System.out.println("a в catch = " + a);
            return a;   // на этой строке значение а=5 копируется для return передачи из метода. (String тоже самое)
            // Не важно, что потом ее значение меняется в finally блоке на 10. (StringBuilder... поменяется!!!)
        } finally {
            a = 10;
            System.out.println("finally block");
            System.out.println("a в finally = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}