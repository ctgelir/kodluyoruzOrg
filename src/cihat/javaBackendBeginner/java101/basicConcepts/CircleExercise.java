package cihat.javaBackendBeginner.java101.basicConcepts;

import java.util.Scanner;

/**
 * Write a program to find the area of a segment of a circle with radius r and central angle a.
 * Take pi = 3.14.
 * Formula : (pi * (r*r) * a) / 360
 * Expect perfect user inputs.
 * @author Cihat Gelir
 */
public class CircleExercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Radius : ");
		float r = scanner.nextFloat();
		System.out.print("Central angle of segment : ");
		float a = scanner.nextFloat();
		
		float area = (3.14f * (r*r) * a) / 360;
		System.out.printf("Area of the segment = %.4f" , area);
		scanner.close();
	}
}
