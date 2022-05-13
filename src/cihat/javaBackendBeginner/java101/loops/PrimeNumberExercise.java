package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class PrimeNumberExercise {
	public static void displayPrimeNumbersBetween(int start, int end) {
		if(end < start) return;
		for(int i = start; i <= end; i++) {
			if (i <= 1) continue;
			System.out.print(isPrime(i) ? i + " ":"");
		}
	}
	
	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)	return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Start: ");
		int start = sc.nextInt();
		
		System.out.print("End: ");
		int end = sc.nextInt();
		
		displayPrimeNumbersBetween(start, end);
		sc.close();
	}
}
