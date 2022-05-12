package cihat.javaBackendBeginner.java101.methods;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class RecursivePrimeNumberExercise {
	public static boolean isPrime(int n, int start) {
		if (n <= 1) return false;
		if ( start == n) return true;
		return n % start != 0 && isPrime(n, start + 1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int num = sc.nextInt();
		
		System.out.println(isPrime(num, 2) ? "Prime.": "Non prime.");
		sc.close();
	}
}
