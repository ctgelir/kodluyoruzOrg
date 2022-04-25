package cihat.javaBackendBeginner.java101.conditionalExpressions;

import java.util.Scanner;
/**
 * 
 * @author cihat
 *
 */
public class SortingNumbersExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float n1,n2,n3;
		
		System.out.print("Number 1: ");
		n1 = scan.nextFloat();
		
		System.out.print("Number 2: ");
		n2 = scan.nextFloat();
		
		System.out.print("Number 3: ");
		n3 = scan.nextFloat();
		
		float max = Math.max(n1, Math.max(n2, n3));
		float min = Math.min(n1, Math.min(n2, n3));
		
		float mid = n1 + n2 + n3 - max - min;
		
		System.out.println(min + " < " + mid + " < " + max);
	}
}
