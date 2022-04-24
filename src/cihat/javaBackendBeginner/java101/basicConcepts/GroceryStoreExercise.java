package cihat.javaBackendBeginner.java101.basicConcepts;

import java.util.Scanner;

/**
 * Write a program that prints the total amount of the products purchased from the grocery store 
 * according to the kilogram values of the users.
 *	
 *	Fruits and KG Prices (TL = Turkish Lira)
 *		Pear: 2.14 TL
 *		Apple : 3.67 TL
 *		Tomatoes: 1.11 TL
 *		Banana: 0.95 TL
 *		Eggplant : 5.00 TL
 * @author Cihat Gelir
 * 
 * NOTE: Expect perfect user inputs.
 */
public class GroceryStoreExercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Pear(KG) : ");
		float pear = scanner.nextFloat();
		
		System.out.print("Apple(KG) : ");
		float apple = scanner.nextFloat();
		
		System.out.print("Tomatoes(KG) : ");
		float tomato = scanner.nextFloat();
		
		System.out.print("Banana(KG) : ");
		float banana = scanner.nextFloat();
		
		System.out.print("Eggplant(KG) : ");
		float eggplant = scanner.nextFloat();
		
		float total = pear*2.14f + apple*3.67f + tomato*1.11f + 
					  banana*0.95f + eggplant*5f;
		System.out.printf("Total money you have to pay: %.2f", total);
		scanner.close();
	}
}
