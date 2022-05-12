package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class BcdLcmExercise {
	public static int bcd(int n1, int n2) {
		int bcd = 1;
		for(int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				bcd = i;
			}
		}
		return bcd;
	}
	
	
	public static int lcm(int n1, int n2) {
		return n1 * n2 / bcd(n1, n2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number1: ");
		int n1 = sc.nextInt();	
		
		System.out.print("Number2: ");
		int n2 = sc.nextInt();	
		
		System.out.println("Biggest Common Division : " + bcd(n1,n2));
		System.out.println("Least Common Multiple   : " + lcm(n1,n2));
		
		sc.close();
	}
}
