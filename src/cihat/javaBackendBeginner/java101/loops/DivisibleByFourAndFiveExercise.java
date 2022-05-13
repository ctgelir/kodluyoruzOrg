package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class DivisibleByFourAndFiveExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int inp = sc.nextInt();
		for (int i = 1; i <= inp; i*=4) {
			System.out.println(i);
		}
		for (int i = 1; i <= inp; i*=5) {
			System.out.println(i);
		}
		sc.close();
	}
}
