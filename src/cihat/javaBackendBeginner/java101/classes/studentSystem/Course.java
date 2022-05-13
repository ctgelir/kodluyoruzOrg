package cihat.javaBackendBeginner.java101.classes.studentSystem;

/**@author Cihat Gelir*/
public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalNote;
    double verbalMultiplier;

    public Course(String name, String code, String prefix, double verbalMultiplier) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
        this.verbalMultiplier = verbalMultiplier;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Operation is successfull.");
        } else {
            System.out.println(t.name + " can not teach this course.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println("Teacher of " + this.name + "is " + courseTeacher.name);
        } else {
            System.out.println("No teacher be appointed to " + this.name);
        }
    }
}

