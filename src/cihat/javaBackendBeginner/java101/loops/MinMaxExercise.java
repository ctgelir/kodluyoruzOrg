package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class MinMaxExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many number you will enter: ");
		int numberOfInteger = sc.nextInt();	
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < numberOfInteger; i++) {
			System.out.print("Number:");
			int userInput = sc.nextInt();
			if (userInput > max)
				max = userInput;
			if (userInput < min)
				min = userInput;
		}
		System.out.println("Max ->" + max);
		System.out.println("Min ->" + min);
	}
}
