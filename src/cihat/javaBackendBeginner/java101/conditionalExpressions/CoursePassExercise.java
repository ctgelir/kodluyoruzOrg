package cihat.javaBackendBeginner.java101.conditionalExpressions;

import java.util.Scanner;
/**
 * @author Cihat Gelir
 */
public class CoursePassExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float mat, phys, tur, chem, music;
		
		System.out.print("Math: ");
		mat = scan.nextFloat();

		System.out.print("Physics: ");
		phys = scan.nextFloat();

		System.out.print("Turkish: ");
		tur = scan.nextFloat();

		System.out.print("Chemistry: ");
		chem = scan.nextFloat();

		System.out.print("Music: ");
		music = scan.nextFloat();
		
		if (mat < 0 || mat > 100)	mat =0;
		if (phys < 0 || phys > 100)	phys =0;
		if (tur < 0 || tur > 100)	tur =0;
		if (chem < 0 || chem > 100)	chem =0;
		if (music < 0 || music > 100)	music =0;
		
		float avg = (mat+phys+tur+chem+music)/5;
		
		System.out.printf((avg > 55) ? "Passed the course!\n" : "Failed the course!\n");
		System.out.printf("gpu : %.2f", avg);
		scan.close();
		
	}
}
