package VideoCourse_02.Lessons.lesson08_work_with_files;

import java.io.File;

public class FileEx {
    public static void main(String[] args) {
        File file = new File("test2.txt"); // - относительный путь
        File directory = new File("C:\\Java\\A"); // - абсолютный путь

        System.out.println("file.getAbsolutePath() ---> " + file.getAbsolutePath());
        System.out.println("directory.getAbsolutePath() ---> " + directory.getAbsolutePath());
        System.out.println("---Абсолютный путь к файлу и папке--------------------");

        System.out.println("file.isAbsolute() ---> " + file.isAbsolute());
        System.out.println("directory.isAbsolute() ---> " + directory.isAbsolute());
        System.out.println("---Проверяет, является ли указанный путь абсолютным---");

        System.out.println("file.isDirectory() ---> " + file.isDirectory());
        System.out.println("directory.isDirectory() ---> " + directory.isDirectory());
        System.out.println("---Проверяет, является ли указанный файл директорией--");

    }
}