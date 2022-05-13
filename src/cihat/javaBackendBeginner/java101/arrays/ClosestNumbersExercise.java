package cihat.javaBackendBeginner.java101.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**@author Cihat Gelir*/
public class ClosestNumbersExercise {
	public static void closest(int[] arr, int n) {
		if(arr == null || arr.length == 0)
			throw new IllegalStateException();
		int smallClosest = Integer.MIN_VALUE;
		int largeClosest = Integer.MAX_VALUE;
		int smallCloseDegree = Math.abs(n-smallClosest);
		int largeCloseDegree = Math.abs(n-largeClosest);
		
		for(int i : arr) {
			if(i <= n) {
				if(Math.abs(n - i) <= smallCloseDegree) {
					smallCloseDegree = Math.abs(n - i);
					smallClosest = i;
				}
			} else {
				if(Math.abs(n - i) <= largeCloseDegree) {
					largeCloseDegree = Math.abs(n - i);
					largeClosest = i;
				}
			}
		}
		if(largeClosest == Integer.MAX_VALUE) {
			System.out.println("Closest number that is less than " + n + ": " + smallClosest);
			System.out.println("No number greater than " + n);
		} else if (smallClosest == Integer.MIN_VALUE) {
			System.out.println("No number less than " + n);
			System.out.println("Closest number that is greater than " + n + ": " + largeClosest);
		} else {
			System.out.println("Closest number that is less than " + n + ": " + smallClosest);
			System.out.println("Closest number that is greater than " + n + ": " + largeClosest);
		}
		
	}
	public static void main(String[] args) {
		int[] arr = {15,12,788,1,-1,-778,2,0};
		System.out.println("Array: " + Arrays.toString(arr));
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int userInput = sc.nextInt();
		
		closest(arr, userInput);
		sc.close();
				
	}
}
