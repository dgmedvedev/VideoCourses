package VideoCourse_02.Lessons.lesson13_annotation;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class samsungClass = Class.forName("VideoCourse_02.Lessons.lesson13_annotation.Samsung");
        SmartPhone annotation1 = (SmartPhone) samsungClass.getAnnotation(SmartPhone.class);
        //SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Samsung class: " + annotation1.OS() + ", " + annotation1.yearOfCompanyCreation());

        Class iphoneClass = Class.forName("VideoCourse_02.Lessons.lesson13_annotation.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from Iphone class: " + sm2.OS() + ", " + sm2.yearOfCompanyCreation());
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";

    int yearOfCompanyCreation() default 1938;
}

@SmartPhone // примет default значения, но если default нет, то обязательно прописать вручную
class Samsung {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}