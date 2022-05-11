package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/** @author Cihat Gelir
 *  Perfect user input expected.*/
public class HarmonicSeriesExercise {
	public static double harmonicSeriesCalculator(int n) {
		double result = 1;
		for (int i = 2; i <= n; i++) {
			result += (1.0/i);
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int userInput = sc.nextInt();
		
		System.out.printf("Harmonic Series: %.5f" , harmonicSeriesCalculator(userInput));
	}
}