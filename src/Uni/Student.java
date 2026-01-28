package Uni;

import java.util.ArrayList;

public class Student {
    protected String firstName;
    protected String secondName;
    protected int id;
    protected String level;
    protected ArrayList<String> courses;

    Student(String firstName, String secondName, int id, String level) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
        this.level = level;
        this.courses = new ArrayList<String>();
    }

    public void addCourses(String courseName) {
        this.courses.add(courseName);
    }
    public void joinedCourses(){
        for (String course : courses) {
            System.out.println(course);
        }
    }

}
