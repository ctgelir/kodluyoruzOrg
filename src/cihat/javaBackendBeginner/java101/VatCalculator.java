package cihat.javaBackendBeginner.java101;

import java.util.Scanner;

/**
	Write a program that takes money value from the user 
	and prints the price with VAT and VAT amount.
	example:
	Price without VAT = 10;
	Price with VAT = 11.8;
	VAT amount = 1.8;

	Homework
	If the amount entered is between 0 and 1000 TL, the VAT rate is 18%, 
	if the amount is greater than 1000 TL, 
	write the program that calculates the VAT amount as 8%.
	
	NOTE: Expect perfect user inputs.
	@author Cihat Gelir
	*/
public class VatCalculator {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Money: ");
		int inputMoney = scanner.nextInt();
		
		float vat = 0.18f;
		float vatAmount;
		float priceWithVat;
		if (inputMoney > 1000)
			vatAmount = 0.08f;
		vatAmount = inputMoney * vat;
		priceWithVat = inputMoney + vatAmount;
		
		System.out.printf("Price without VAT = " + inputMoney +
						  "\nPrice with VAT = %.2f \nVAT amount = %.2f", priceWithVat,vatAmount );
		scanner.close();
	}
}
