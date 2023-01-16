package videoCourse_02.lessons.lesson08_work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
    public static void main(String[] args) throws IOException {
        File file = new File("test2.txt"); // - относительный путь
        File folder = new File("C:\\Java\\A"); // - абсолютный путь
        File file2 = new File("C:\\Java\\A\\file2.txt"); // - файла не было, но создается в программе
        File file3 = new File("C:\\Java\\A\\file3.txt"); // - файла не было, но создается в программе
        File folder2 = new File("C:\\Java\\A\\B"); // - директории не было, но создается в программе

        System.out.println("file.getAbsolutePath() ---> " + file.getAbsolutePath());
        System.out.println("folder.getAbsolutePath() ---> " + folder.getAbsolutePath());
        System.out.println("---Абсолютный путь к файлу и папке--------------------");

        System.out.println("file.isAbsolute() ---> " + file.isAbsolute());
        System.out.println("folder.isAbsolute() ---> " + folder.isAbsolute());
        System.out.println("---Проверяет, является ли указанный путь абсолютным---");

        System.out.println("file.isDirectory() ---> " + file.isDirectory());
        System.out.println("folder.isDirectory() ---> " + folder.isDirectory());
        System.out.println("---Проверяет, является ли указанный файл директорией--");

        System.out.println("file.exists() ---> " + file.exists());
        System.out.println("folder.exists() ---> " + folder.exists());
        System.out.println("file2.exists() ---> " + file2.exists());
        System.out.println("folder2.exists() ---> " + folder2.exists());
        System.out.println("---Проверяет, существует ли такой файл или директория-");

        System.out.println("file2.createNewFile() ---> " + file2.createNewFile()); // - выбрасывает IOException
        System.out.println("file3.createNewFile() ---> " + file3.createNewFile());
        System.out.println("folder2.mkdir() ---> " + folder2.mkdir());
        System.out.println("---Создает файл или директорию, если их не было-------");

        System.out.println("file2.length() ---> " + file.length());
        System.out.println("folder.length() ---> " + folder.length()); // - размер папки вычисляется другим способом
        System.out.println("---Возвращает размер файла----------------------------");

        File[] files = folder.listFiles();
        System.out.println(Arrays.toString(files));
        System.out.println("file.isHidden() ---> " + file.isHidden()); // - проверяет скрыт ли файл/папка
        System.out.println("file.canRead() ---> " + file.canRead());  // - есть ли доступ на чтение файла/папки
        System.out.println("file.canWrite() ---> " + file.canWrite());  // - есть ли доступ на запись файла/папки
        System.out.println("file.canExecute() ---> " + file.canExecute());  // - есть ли доступ на запуск файла/папки
        System.out.println("------------------------------------------------------");

        System.out.println("folder.delete() ---> " + folder.delete());
        System.out.println("folder2.delete() ---> " + folder2.delete());
        System.out.println("file2.delete() ---> " + file2.delete());
        System.out.println("---Удаляет файл или ПУСТУЮ директорию-----------------");
    }
}