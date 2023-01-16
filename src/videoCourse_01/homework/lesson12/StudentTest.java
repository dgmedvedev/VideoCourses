package videoCourse_01.homework.lesson12;

import videoCourse_01.lessons.lesson11.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1,7.7);
        Student st2 = new Student("Ivan", 1,7.7);
        Student st3 = new Student("Ivan", 1,8.8);
        Student st4 = new Student("Ivan", 2,7.7);
        Student st5 = new Student("Petr", 2,8.8);

        System.out.println("Сравнение st1 и st2:");
        compareStudents(st1,st2);

        System.out.println("Сравнение st1 и st3:");
        compareStudents(st1,st3);

        System.out.println("Отличие st1 и st3:");
        differenceStudents(st1,st3);

        System.out.println("Отличие st1 и st4:");
        differenceStudents(st1,st4);

        System.out.println("Отличие st1 и st5:");
        differenceStudents(st1,st5);
    }

    private static void compareStudents(Student st1, Student st2) {
        if (st1.getName().equals(st2.getName()) &&
                st1.getCourse() == st2.getCourse() &&
                st1.getGrade() == st2.getGrade()) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты НЕ равны");
        }
        System.out.println();
    }

    private static void differenceStudents(Student st1, Student st2) {
        if (st1.getName().equals(st2.getName())) {
            if (st1.getCourse() == st2.getCourse()) {
                if (st1.getGrade() == st2.getGrade()) {
                    System.out.println("Студенты равны");
                } else {
                    System.out.println("Имена и курсы у студентов одинаковые, но разные оценки");
                }
            } else {
                System.out.println("Имена студентов одинаковые, но разные курсы");
            }
        } else {
            System.out.println("У студентов разные имена");
        }
        System.out.println();
    }
}