package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/** @author Cihat Gelir
 *  Perfect inputs expected.
 * */
public class ExponentExercise {
	public static int exp(int a, int r) {
		int result = 1;
		for (int i = 0; i < r; i++) {
			result *= a;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		int a = sc.nextInt();
		
		System.out.print("r: ");
		int r = sc.nextInt();
		
		System.out.println(exp(a,r));
		sc.close();
	}
	
}
