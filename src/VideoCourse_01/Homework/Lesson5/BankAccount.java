package VideoCourse_01.Homework.Lesson5;

public class BankAccount {
    int id;
    double balance;
    String name;

    double popolnenieScheta(double money) {
        return balance += money;
    }

    double snyatieSoScheta(double money) {
        return balance -= money;
    }
}