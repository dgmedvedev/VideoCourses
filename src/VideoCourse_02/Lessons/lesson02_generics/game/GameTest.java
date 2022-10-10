package VideoCourse_02.Lessons.lesson02_generics.game;

public class GameTest {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 11);
        Schoolar schoolar2 = new Schoolar("Petr", 12);
        Schoolar schoolar3 = new Schoolar("Nikolay", 13);
        Schoolar schoolar4 = new Schoolar("Olga", 14);
        Student student1 = new Student("Sergey", 20);
        Student student2 = new Student("Semen", 21);
        Employee employee1 = new Employee("Alexandr", 33);
        Employee employee2 = new Employee("Alexey", 43);

        Team<Schoolar> schoolarTeam1 = new Team<>("Dragons");
        Team<Student> studentTeam = new Team<>("Study, study, study");
        Team<Employee> employeeTeam = new Team<>("Hardworking");
        // Team<String> anotherTeam = new Team<>("CommandStrings"); - <T extends Participant> решена проблема создания команд неограниченного типа

        schoolarTeam1.addNewParticipant(schoolar1);
        schoolarTeam1.addNewParticipant(schoolar2);
        // schoolarTeam1.addNewParticipant(employee1); - <T> решена проблема связанная с добавлением студента в команду школьников
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Tigers");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);
        schoolarTeam1.playWith(schoolarTeam2);
        // schoolarTeam1.playWith(studentTeam); // public void playWith(Team<T> team){...} решена проблема соревнования между командами разных типов
    }
}