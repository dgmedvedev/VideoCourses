package VideoCourse_02.Lessons.lesson08_work_with_files.file_tree;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Java");
        Path source = Paths.get("C:\\Java\\X");
        Path destination = Paths.get("C:\\Java\\CopyHere");

        Files.walkFileTree(path, new MyFileVisitor2(source, destination));

    }
}

class MyFileVisitor2 extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;

    public MyFileVisitor2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination);
        return FileVisitResult.CONTINUE;
    }
}