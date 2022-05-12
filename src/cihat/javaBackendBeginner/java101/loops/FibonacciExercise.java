package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class FibonacciExercise {
	public static void displayFibonacciFor(int n) {
		if (n < 2) return;
		
		int a = 0,b = 1;
		System.out.print(a + " " + b + " ");
		
		for(int i = 0; i < n-2; i++) {
			int temp = b;
			b = a+b;
			a = temp;
			System.out.print(b + " ");
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of steps: ");
		int step = sc.nextInt();
		displayFibonacciFor(step);
		sc.close();
	}
}
