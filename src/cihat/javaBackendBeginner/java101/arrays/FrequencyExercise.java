package cihat.javaBackendBeginner.java101.arrays;

import java.util.Arrays;

/**@author Cihat Gelir*/
public class FrequencyExercise {
	public static void freq(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(numberOfOccurrences(Arrays.copyOf(arr, i), arr[i]) > 0) {
				continue;
			}
			System.out.println("Frequency of " + arr[i] + " : " + numberOfOccurrences(arr, arr[i]));
		}
	}
	
	private static int numberOfOccurrences(int[] arr, int n) {
		int freq = 0;
		if(arr.length == 0) return freq;
		for(int i: arr) {
			if (i==n) freq++;
		}
		return freq;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
		freq(arr);
	}
}
