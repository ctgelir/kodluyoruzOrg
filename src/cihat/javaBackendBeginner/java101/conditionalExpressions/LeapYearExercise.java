package cihat.javaBackendBeginner.java101.conditionalExpressions;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class LeapYearExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		boolean isLeapYear = year%100 == 0 ? (year % 400 == 0 ? true : false) : (year%4  == 0 ? true: false);
		
		System.out.println(year + (isLeapYear ? " is a leap year." : " is not a leap year."));
	}
}
