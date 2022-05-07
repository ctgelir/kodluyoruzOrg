package cihat.javaBackendBeginner.java101.conditionalExpressions;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class FlightTicketPriceExercise {
	public static void main(String[] args) {
		
		final float PRICE_PER_KM = 0.10f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distance (km): ");
		int distance = sc.nextInt();
		
		System.out.print("Your age (year): ");
		int age = sc.nextInt();
		
		System.out.print("Trip type (1 for one way - 2 for round): ");
		int tripType = sc.nextInt();
		
		if (age < 0 || distance < 0 || (tripType != 1 && tripType != 2)) {
			System.out.println("Invalid input.");
			System.exit(0);
		}
		
		float normalPrice = distance * PRICE_PER_KM;
		
		float discount = (age < 12) ? 0.5f : (age < 24) ? 0.1f : (age > 65) ?  0.3f : 0f;
		
		float discountedPrice = normalPrice  - normalPrice * discount;
		
		discountedPrice = (tripType == 1) ? discountedPrice : (discountedPrice - discountedPrice* 0.2f) * 2f;
		
		System.out.printf("Price : %.2f" + " TL", discountedPrice);
		
	}
}
