package VideoCourse_01.Homework.Lesson11;

public class Student {

    Student() {
    }

    Student(int id, String name, String surname, int course,
            double averageScoreMathematics, double averageScoreEconomics, double averageScoreEnglish) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.averageScoreMathematics = averageScoreMathematics;
        this.averageScoreEconomics = averageScoreEconomics;
        this.averageScoreEnglish = averageScoreEnglish;
    }

    Student(int id, String name, String surname, int course) {
        this(id, name, surname, course, 0, 0, 0);
    }

    int id;
    int course;
    double averageScoreMathematics;
    double averageScoreEconomics;
    double averageScoreEnglish;
    String name;
    String surname;
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student(2, "Mike", "White", 3);
        Student st3 = new Student(3, "Kate", "Baby", 1,
                9.9, 8.8, 7.7);

        st1.averageScoreEnglish = 5.5;
        st1.averageScoreEconomics = 6.6;
        st1.averageScoreMathematics = 7.7;

        st2.averageScoreEnglish = 6.6;
        st2.averageScoreEconomics = 7.7;
        st2.averageScoreMathematics = 8;

        System.out.println("Average score st1 = " + averageScore(st1));
        System.out.println("Average score st2 = " + averageScore(st2));
        System.out.println("Average score st3 = " + averageScore(st3));
    }

    private static double averageScore(Student student) {
        int countStudent = 3;
        return (student.averageScoreMathematics +
                student.averageScoreEconomics + student.averageScoreEnglish) / countStudent;
    }
}