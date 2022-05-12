package cihat.javaBackendBeginner.java101.methods;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class RecursivePowerExercise {
	
	public static int recPow(int n, int r) {
		if (r == 1) return n;
		return n * recPow(n,r-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Base: ");
		int base = sc.nextInt();
		
		System.out.print("Power: ");
		int pow = sc.nextInt();
		
		System.out.println("Result: " + recPow(base, pow));
		sc.close();
	}
}
