package cihat.javaBackendBeginner.java101;

import java.util.Scanner;

/**
 * Write a program that prints the taximeter amount to the screen according to the distance traveled (KM).
 * 
 * Pricing Table:
 * 
 * Taximeter costs 2.20 TL per km. (TL = Turkish Lira)
 * The minimum amount to be paid is 20 TL. 20 TL will be charged for the fees below 20 TL.
 * Taximeter opening fee is 10 TL.
 * 
 * NOTE: Expect perfect user inputs.
 * @author Cihat Gelir
 */
public class TaxiPriceCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Distance traveled: ");
		int distanceTraveled = scanner.nextInt();
		
		float openingFee = 10f;
		float taximeterCost = distanceTraveled * 2.20f;
		
		float totalFee = openingFee + taximeterCost;
		
		if (totalFee < 20)
			totalFee = 20;
		
		System.out.printf("Your total fee = %.2f TL" , totalFee);
		scanner.close();
	}
}
