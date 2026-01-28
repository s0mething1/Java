package Uni;

import java.util.ArrayList;

public class Teachers {
    protected String firstName;
    protected String secondName;
    protected int id;
    protected ArrayList<Subject> subjects;

    Teachers (String firstName, String secondName, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
        subjects = new ArrayList<Subject>();
    }

    public void attachToSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public void sub(){
        for (Subject subject : subjects) {
            System.out.println(subject.subjectName);
        }
    }

}
