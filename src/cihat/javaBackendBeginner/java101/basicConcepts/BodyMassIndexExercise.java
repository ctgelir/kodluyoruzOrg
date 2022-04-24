package cihat.javaBackendBeginner.java101.basicConcepts;

import java.util.Scanner;

/**
 * Calculate the "Body Mass Index" value and print it on the screen.
 *
 * Formula
 * Weight (kg) / Height (m) * Height (m)
 * @author Cihat Gelir
 */
public class BodyMassIndexExercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Your weight(kg) : ");
		float w = scanner.nextFloat();
		
		System.out.print("Your height(m) : ");
		float h = scanner.nextFloat();
		
		float bmi = w / (h * h); 
		System.out.printf("Body mass index : %.3f " , bmi);
		scanner.close();
	}
}

