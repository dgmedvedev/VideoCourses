package VideoCourse_01.Lessons.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File file = new File("testFile.txt");
            System.out.println("The File Object has been created ");
            FileInputStream fis = new FileInputStream(file);
            System.out.println("The InputStream has been created");
            int counter = 0;
            while (true) {
                counter++;
                result.append(fis.read());
                System.out.println("Reading info");
                if (counter == 3) {
                    fis.close();
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("------------------");
            System.out.println("Exception 1: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("------------------");
            System.out.println("result: " + result);
            System.out.println("Exception 2: " + e.getMessage());
        } finally {
            System.out.println("------------------");
            System.out.println("finally");
        }
    }
}