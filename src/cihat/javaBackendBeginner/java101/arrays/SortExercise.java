package cihat.javaBackendBeginner.java101.arrays;

import java.util.Arrays;
import java.util.Scanner;


public class SortExercise {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Length of array: ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		for(int i = 0; i < len; i++) {
			System.out.print("Element at position = " + (i+1) + " : ");
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
