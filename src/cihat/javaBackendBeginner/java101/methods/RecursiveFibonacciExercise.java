package cihat.javaBackendBeginner.java101.methods;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class RecursiveFibonacciExercise {
	private static int fibo(int n) {
		if (n == 1) return 0;
		if (n == 2) return 1;
		return fibo(n-1) + fibo(n-2);
	}
	
	public static void makeFibonacciSeries(int step) {
		for(int i = 1; i < step; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number of step: ");
		int step = sc.nextInt();
		
		makeFibonacciSeries(step);
		
	}
}