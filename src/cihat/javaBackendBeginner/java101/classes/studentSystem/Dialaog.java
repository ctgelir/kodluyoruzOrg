package cihat.javaBackendBeginner.java101.classes.studentSystem;

/**@author Cihat Gelir*/
public class Dialaog {
    public static void main(String[] args) {

        Course mat = new Course("Math", "MAT101", "MAT", 0.3);
        Course phys = new Course("Physics", "FZK101", "PHYS", 0.2);
        Course chem = new Course("Chemistry", "KMY101", "CHEM", 0.4);

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Dil", "90550000001", "PHYS");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHEM");

        mat.addTeacher(t1);
        phys.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("Cow Kemal", 4, "140144015", mat, phys, chem);
        s1.addBulkExamNote(50,20,40);
        s1.addVerbalNote(95, 70, 90);
        s1.isPass();

        Student s2 = new Student("Stubby Necmi", 4, "2211133", mat, phys, chem);
        s2.addBulkExamNote(100,50,40);
        s2.addVerbalNote(25, 10, 30);
        s2.isPass();

        Student s3 = new Student("Rascal Ismail", 4, "221121312", mat, phys, chem);
        s3.addBulkExamNote(50,20,40);
        s3.addVerbalNote(100, 90, 95);
        s3.isPass();

    }
}
