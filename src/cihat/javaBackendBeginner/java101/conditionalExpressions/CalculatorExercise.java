package cihat.javaBackendBeginner.java101.conditionalExpressions;

import java.util.Scanner;

/**
 * Write a basic program that takes 2 numbers from user and 1 operation input(add,subtract,multiply,divide).
 * Then w.r.t operation input, program prints result.
 * NOTE: Check DivisionByZeroError.
 * @author Cihat Gelir
 */
public class CalculatorExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number 1: ");
		float n1 = scan.nextFloat();
		
		System.out.print("Number 2: ");
		float n2 = scan.nextFloat();
		
		System.out.print("\nAdding -> 1 \nSubtracting -> 2 \nMultiplication -> 3 \nDivision -> 4 \nChoice :");
		int choice = scan.nextInt();
		switch (choice) {
			case 1:
				System.out.println(n1+n2);
				break;
			case 2:
				System.out.println(n1-n2);
				break;
			case 3:
				System.out.println(n1*n2);
				break;
			case 4:
				if (n2 == 0) {
					System.out.println("Can not divide by Zero!");
					break;
				}
				System.out.println(n1/n2);
				break;
			default:
				System.out.println("Invalid Choice.");
				break;
		}
		scan.close();
	}
}
