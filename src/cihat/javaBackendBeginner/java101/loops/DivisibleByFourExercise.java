package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

public class DivisibleByFourExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int inp = sc.nextInt();
		int sum = 0;
		
		while (inp %2 == 0) {
			if (inp %4 == 0) {
				sum+=inp;
			}
			inp = sc.nextInt();
		}
		System.out.printf("Sum of numbers that are divisible with 4: " + sum);
		
		
		
	}
}
