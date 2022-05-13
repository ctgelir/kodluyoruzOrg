package cihat.javaBackendBeginner.java101.conditionalExpressions;

import java.util.Scanner;
/**
 * @author Cihat Gelir
 */
public class UserLoginExercise {
	public static void main(String[] args) {
		String userName, password;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("User name: ");
		userName = scan.next();
		
		System.out.print("Password: ");
		password = scan.next();
		
		if (userName.equals("patika") && !password.equals("java123")) {
			System.out.println("Wrong password.\nTo reset : 0");
			int input = scan.nextInt();
			if (input == 0) {
				System.out.print("New password: ");
				String tempPassword = scan.next();
				if (tempPassword.equals("java123")) {
					System.out.println("New password same with before.");
				}else {
					password = tempPassword;
					System.out.println("Password successfully created.");
				}
			}
		} else if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Successfully login.");
		}else {
			System.out.println("Wrong username and password.");
		}
		scan.close();
		
		
	}
}
