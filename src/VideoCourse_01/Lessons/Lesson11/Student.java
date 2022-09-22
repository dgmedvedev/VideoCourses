package VideoCourse_01.Lessons.Lesson11;

public class Student {

    private String name;
    private int course;
    private double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }
}