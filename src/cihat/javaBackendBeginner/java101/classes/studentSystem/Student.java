package cihat.javaBackendBeginner.java101.classes.studentSystem;

/**@author Cihat Gelir*/
public class Student {
	String name,stuNo;
    int classes;
    Course mat;
    Course physics;
    Course chemistry;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.physics = fizik;
        this.chemistry = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addVerbalNote(int mat, int phys, int chem) {

        if (mat >= 0 && mat <= 100) {
            this.mat.verbalNote = mat;
        }

        if (phys >= 0 && phys <= 100) {
            this.physics.verbalNote = phys;
        }

        if (chem >= 0 && chem <= 100) {
            this.chemistry.verbalNote = chem;
        }

    }
    
    public void addBulkExamNote(int mat, int phys, int chem) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (phys >= 0 && phys <= 100) {
            this.physics.note = phys;
        }

        if (chem >= 0 && chem <= 100) {
            this.chemistry.note = chem;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.physics.note == 0 || this.chemistry.note == 0) {
            System.out.println("Missing notes.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.printf("Gpa : %.2f  \n" , this.avarage);
            if (this.isPass) {
                System.out.println("Passed the course.");
            } else {
                System.out.println("Failed the course.");
            }
        }
    }

    public void calcAvarage() {
    	double matVerbMult = this.mat.verbalMultiplier;
    	double physVerbMult = this.physics.verbalMultiplier;
    	double chemVerbMult = this.chemistry.verbalMultiplier;
    	
    	int phys = this.physics.note;
    	int mat = this.mat.note;
    	int chem = this.chemistry.note;
    	
    	int physV = this.physics.verbalNote;
    	int matV = this.mat.verbalNote;
    	int chemV = this.chemistry.verbalNote;
    	
    	
        this.avarage = ((phys*(1-physVerbMult) + physV*physVerbMult) +
        			   (mat*(1-matVerbMult) + matV*matVerbMult) + 
        			   (chem*(1-chemVerbMult) + chemV*chemVerbMult) ) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Student : " + this.name);
        System.out.println("Math : " + this.mat.note + " --- Verbal Math Note: " + this.mat.verbalNote + " --- Multiplier of verbal note: " + this.mat.verbalMultiplier);
        System.out.println("Physics : " + this.physics.note + " --- Verbal Physics Note: " + this.physics.verbalNote + " --- Multiplier of verbal note: " + this.physics.verbalMultiplier);
        System.out.println("Chemistry : " + this.chemistry.note + " --- Verbal Chemistry Note: " + this.chemistry.verbalNote + " --- Multiplier of verbal note: " + this.chemistry.verbalMultiplier);
    }
}
