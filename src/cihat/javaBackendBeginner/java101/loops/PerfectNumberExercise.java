package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class PerfectNumberExercise {
	
	public static boolean isPerfect(int n) {
		if (n == 1) return false;
		int sumOfFactors = 0;
		for (int i = 1; i <= (n/2)+1; i++) {
			if (n % i  == 0)
				sumOfFactors += i;
		}
		return (sumOfFactors == n) ? true:false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int userInput = sc.nextInt();
		System.out.println(isPerfect(userInput) ? "It is a perfect number.":"It is not a perfect number");
		sc.close();
	}
}
