package cihat.javaBackendBeginner.java101.methods;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class PalindromeNumberExercise {
	public static boolean isPalindrome(int n) {
		String x = Integer.toString(n);
		int len = x.length();
		if (len % 2 == 0) {
			for(int i = 0; i < len/2; i++) {
				if (x.charAt(i) != x.charAt(len - (i + 1))) {
					return false;
				}
			}
		} else {
			for(int i = 0; i < len/2 - 1; i++) {
				if (x.charAt(i) != x.charAt(len - (i + 1))) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number: ");
		int userInput = sc.nextInt();
		
		System.out.println(isPalindrome(userInput) ? "It is palindrome number.": "It is not a palindrome number.");
	}
}