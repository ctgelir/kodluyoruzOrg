package cihat.javaBackendBeginner.java101.arrays;

import java.util.Arrays;

/**@author Cihat Gelir*/
public class TransposeExercise {
	public static int[][] transpose(int[][] arr){
		int[][] temp = new int[arr[0].length][arr.length];
		for(int row = 0; row < arr.length; row++) {
			for(int column = 0; column < arr[row].length; column++) {
				temp[column][row] = arr[row][column];
			}
		}
		return temp;
	}
	
	public static void displayMatrix(int[][] arr) {
		for(int row = 0; row < arr.length; row++) {
			System.out.print("{ ");
			for(int column = 0; column < arr[row].length; column++) {
				System.out.print(arr[row][column] + " ");
			}
			System.out.println("}");
		}
	}
	
	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6}};
		System.out.println("Original array: ");
		displayMatrix(arr);
		
		System.out.println("Transpose array: ");
		displayMatrix(transpose(arr));
		
	}
}
