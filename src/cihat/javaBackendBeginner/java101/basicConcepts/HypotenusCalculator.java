package cihat.javaBackendBeginner.java101.basicConcepts;

import java.util.Scanner;

/**
 * Write a program that takes length of perpendicular sides 
 * from the user and calculates the hypotenuse.
 * 
 * @author Cihat Gelir
 * NOTE: Expect perfect user inputs.
 */
public class HypotenusCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Side 1: ");
		int side1 = scanner.nextInt();
		
		System.out.print("Side 2: ");
		int side2 = scanner.nextInt();
		
		double hypotenus = Math.sqrt(side1*side1 + side2*side2);
		
		System.out.printf("Hypotenus = %.2f", hypotenus);
		
		scanner.close();
	}
}
