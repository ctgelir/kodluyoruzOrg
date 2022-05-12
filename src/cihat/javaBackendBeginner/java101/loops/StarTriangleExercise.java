package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;


/**@author Cihat Gelir*/
public class StarTriangleExercise {
	public static void makeTriangle(int step) {
		int n = step;
		for(int i = 1; i <= step; i++) {
			for(int j = 1; j <= i-1;j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*n-1; k++) {
				System.out.print("*");
			}
			n--;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of step: ");
		int userInput = sc.nextInt();
		makeTriangle(userInput);
	}
}
