package Uni;

import java.util.ArrayList;

public class Student {
    protected String firstName;
    protected String secondName;
    protected int id;
    protected String level;
    protected ArrayList<Subject> subjects;

    Student(String firstName, String secondName, int id, String level) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
        this.level = level;
        this.subjects = new ArrayList<Subject>();
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
    public void joinedSubjects(){
        for(Subject subject : this.subjects){
            System.out.println(subject.subjectName);
        }
    }

}
