import java.util.ArrayList;

public class Subject {
    protected String subjectName;
    protected String courseId;
    protected int credit;
    protected ArrayList<Student> studentsList;
    protected ArrayList<Teachers> teachersList;

    Subject(String subjectName, String courseId, int credit){
        this.courseId = courseId;
        this.subjectName = subjectName;
        this.credit = credit;
        this.studentsList = new ArrayList<Student>();
        this.teachersList = new ArrayList<Teachers>();
    }

    public void addStudent(Student student) {
        this.studentsList.add(student);
        student.addCourses(this.subjectName);
    }

    public void addTeacher(Teachers teacher) {
        this.teachersList.add(teacher);
        teacher.attachToSubject(this);
    }

    public String toString() {
        return "Course name: " + this.subjectName + "\nCourse ID: " + this.courseId + "\nGiven Credit: " + this.credit;
    }
}
