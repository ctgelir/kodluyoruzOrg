package cihat.javaBackendBeginner.java101.graduationProject;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class Dialog {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Row of the Mine Field: ");
		int row = sc.nextInt();
		
		System.out.print("Column of the Mine Field: ");
		int column = sc.nextInt();
		
		MineSweeper m = new MineSweeper(row, column);
		
		System.out.println("Location of the mines:");
		m.displayFieldEnd();
		System.out.println("=====================================");
		System.out.println("Welcome to the Mine Field!");
		
		m.displayFieldCensored();
		while(!m.isLost() && !m.isWon()) {
			
			System.out.printf("Row: ");
			int r = sc.nextInt();
			
			System.out.printf("Column: ");
			int c = sc.nextInt();
			
			if(!m.isValidCell(r, c)) {
				System.out.println("Please enter valid location!");
				continue;
			}
			m.hit(r, c);
		}
		sc.close();
	}
}
