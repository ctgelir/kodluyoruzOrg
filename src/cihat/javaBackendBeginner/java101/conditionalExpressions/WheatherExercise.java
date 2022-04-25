package cihat.javaBackendBeginner.java101.conditionalExpressions;

import java.util.Scanner;

/**
 * 
 * @author Cihat Gelir
 *
 */
public class WheatherExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Wheather temperature: ");
		float temperature = scan.nextFloat();
		
		System.out.printf((temperature < 5) ? "Go ski." : 
						  (temperature <= 15) ? "Go sinema." : 
					      (temperature <= 25) ? "Go picnic." : "Go swimming.");                                                          
	}
}
