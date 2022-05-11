package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/** @author Cihat Gelir
 *  Perfect input expected.*/
public class CombinationExercise {

	public static int combin(int n, int r) {
		return fact(n) / (fact(r) * fact(n-r));
	}
	
	private static int fact(int t) {
		int fact = 1;
		for(int i = 1; i <= t; i++) {
			fact *=i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n: ");
		int n = sc.nextInt();
		System.out.print("r: ");
		int r = sc.nextInt();
		
		System.out.println("Combination: " + CombinationExercise.combin(n, r));
	}
}
