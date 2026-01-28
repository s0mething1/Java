package Uni;

import java.util.ArrayList;

public class Teachers {
    protected String firstName;
    protected String secondName;
    private static int counter;
    protected int id;
    protected ArrayList<Subject> subjects;

    Teachers (String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = counter++;
        subjects = new ArrayList<Subject>();
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public void getSubjects(){
        for (Subject subject : subjects) {
            System.out.println(subject.subjectName);
        }
    }

    public String getName(){
        return this.firstName + " " + this.secondName;
    }

}
