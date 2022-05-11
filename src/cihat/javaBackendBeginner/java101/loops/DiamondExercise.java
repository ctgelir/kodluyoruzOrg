package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/** @author Cihat Gelir
 * 	Perfect user input expected. */
public class DiamondExercise {	
	public static void makeDiamond(int n) {
		for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
		for (int i = n-1; i >= 0 ; i--) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int userInput = sc.nextInt();		
		makeDiamond(userInput);
	}
}