package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class DivisibleByTwelveExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int inp = sc.nextInt();
		
		int sum = 0;
		int numberOfInteger = 0;
		for (int i = 12; i <= inp; i++) {
			if (i % 12 == 0) {
				sum += i;
				numberOfInteger++;
			}
		}
		float avg = sum / numberOfInteger;
		System.out.printf("Average of number that are divisible with 12 from  0 to " + inp + ": %.2f", avg);
		sc.close();
	}
}
