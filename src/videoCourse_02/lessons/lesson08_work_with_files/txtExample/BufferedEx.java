package videoCourse_02.lessons.lesson08_work_with_files.txtExample;

import java.io.*;

public class BufferedEx {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("testFile.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("testFileCopy.txt"))) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                writer.write(character);
//            }

            // У BufferedReader есть метод readLine(), который работает построчно
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write('\n');
            }
            System.out.println("Done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}