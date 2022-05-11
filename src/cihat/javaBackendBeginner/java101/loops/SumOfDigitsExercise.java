package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/** @author Cihat Gelir
 *  Perfect user inputs expected.*/
public class SumOfDigitsExercise {
	public static int sumOfDigit(int n) {
		int sumOfDigit = 0;
		int d = 10;
		while(10*d < n) {	d *= 10;}
		
		while (d >= 1) {
			int k = n/d;
			sumOfDigit += k;
			n -= k *d;
			d /= 10;
		}
		return sumOfDigit;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int userInput = sc.nextInt();
		
		System.out.println("Sum of digit: " + sumOfDigit(userInput));
	}
}
