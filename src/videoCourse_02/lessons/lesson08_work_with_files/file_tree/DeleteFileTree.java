package videoCourse_02.lessons.lesson08_work_with_files.file_tree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFileTree {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Java\\CopyHere");
        if (Files.exists(path)) {
            Files.walkFileTree(path, new MyFileVisitor3());
        } else {
            System.out.println("Такого файла/папки не существует: " + path);
        }
    }
}

class MyFileVisitor3 extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("Delete file: " + file);
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Delete Directory: " + dir);
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }
}