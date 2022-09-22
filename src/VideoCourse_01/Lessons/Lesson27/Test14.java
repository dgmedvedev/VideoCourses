package VideoCourse_01.Lessons.Lesson27;
import java.io.*;
public class Test14 {
    static FileInputStream fis1,fis2;

    public static void main(String[] args) {
        try{
            fis1 = new FileInputStream("testFile.txt");
            System.out.println("testFile.txt is found");
            try{
                fis2.close();
            }catch (IOException e){
                System.out.println("Problems with stream fis2");
            }
        }catch (FileNotFoundException e){
            System.out.println("testFile.txt not found");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
}