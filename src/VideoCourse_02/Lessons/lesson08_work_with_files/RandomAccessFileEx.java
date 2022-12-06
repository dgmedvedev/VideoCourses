package VideoCourse_02.Lessons.lesson08_work_with_files;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {
            int a = file.read(); // - читает один символ из файла
            System.out.println((char) a);
            String s1 = file.readLine(); // - читает строку из файла
            System.out.println(s1);

            file.seek(101); // перемещение курсора (pointer) на указанную позицию
            String s2 = file.readLine();
            System.out.println(s2);

            long position = file.getFilePointer(); // - возвращает текущее положение курсора (pointera)
            System.out.println(position);

//            Перезапишет текст поверх существующего
//            file.seek(0);
//            file.writeBytes("hello");

            file.seek(file.length() - 1); // - перемещает курсор в конец файла
            file.writeBytes("\n\t\t\t\t\tWilliam Butler Yeats");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}