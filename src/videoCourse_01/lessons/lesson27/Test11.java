package videoCourse_01.lessons.lesson27;

import java.io.*;

public class Test11 {
    FileInputStream fis1, fis2;

    public void abc() {

        try {
            fis1 = new FileInputStream("testFile.txt");

            try {
                System.out.println("Nested try block");
                fis2 = new FileInputStream("testFile2.txt");
            } catch (FileNotFoundException e) {
                System.out.println("testFile2.txt not found");
            }
        } catch (FileNotFoundException e) {
            System.out.println("testFile.txt not found");
        } finally {
            System.out.println("finally block");
            try {
                fis1.close();
                fis2.close();   // NullPointerException, т.к. fis2 = null
            } catch (IOException e) {
                System.out.println("Exception in finally block");
            }
        }
    }

    public static void main(String[] args) {
        Test11 test = new Test11();
        test.abc();
    }
}