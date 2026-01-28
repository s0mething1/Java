import java.util.ArrayList;
import java.util.Scanner;

public class ClassroomControl {
    public static void main(String[] args) {
        Teachers teacherOne = new Teachers("Shohruh", "Sattarov", 123);
        Student studentOne = new Student("Sabosha", "Aslidinova", 12, "Junior");
        Subject math = new Subject("Math", "M012", 3);
        math.addStudent(studentOne);
        math.addTeacher(teacherOne);
        System.out.println(math.toString());
        studentOne.joinedCourses();
        teacherOne.sub();



    }
}
