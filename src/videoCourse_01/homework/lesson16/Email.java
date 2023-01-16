package videoCourse_01.homework.lesson16;

public class Email {
    static void emailName(String email) {
        int i = 0;

        while (i < email.length()) {
            int i1 = email.indexOf("@", i);
            int i2 = email.indexOf(".", i);
            int i3 = email.indexOf(";", i);

            String result = email.substring(i1 + 1, i2);
            System.out.println(result);
            i = i3 + 1;
        }
    }
}

class EmailTest {
    public static void main(String[] args) {
        String email = "it@tut.by;mail@gmail.com;office@yandex.ru;ya@yahoo.com;";
        Email.emailName(email);
    }
}