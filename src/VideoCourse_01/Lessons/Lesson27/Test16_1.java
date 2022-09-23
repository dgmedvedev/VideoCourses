package VideoCourse_01.Lessons.Lesson27;

public class Test16_1 {
    public static void main(String[] args) {
        createPassword("password");
    }

    public static void createPassword(String password){
        if(password.length()<6){
            throw new IllegalArgumentException("Password very short");
        }
        if(password.length()>12){
            throw new IllegalArgumentException("Password very long");
        }
        System.out.println("Good password");
    }
}