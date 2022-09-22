package VideoCourse_01.Lessons.Lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {

//  Очередность у catch блоков может быть любой, но только в том случае, если они никак не относятся друг к другу,
//  т.е. между типами Exception нет связи is-A (иерархии классов разные).
//  В противном случае, вначале (сверху) располагаются catch блоки с дочерними классами, ниже catch блоки с суперклассами.

        try {
            File file = new File("testFile1.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("catch Exception A1");
        } catch (IOException e) {
            System.out.println("catch Exception A2");
        } catch (NullPointerException e) {
            System.out.println("catch Exception B1");
        } catch (RuntimeException e) {
            System.out.println("catch Exception B2");
        } catch (Exception e) {
            System.out.println("catch Exception B3");
        } catch (Throwable e) {
            System.out.println("catch Exception B4");
        }
    }
}