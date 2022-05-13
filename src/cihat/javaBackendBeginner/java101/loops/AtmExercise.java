package cihat.javaBackendBeginner.java101.loops;

import java.util.Scanner;

/** @author Cihat Gelir
 *  Perfect user input expected.*/
public class AtmExercise {	
	public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("User Name :");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Hello, Welcome to the Bank of Kodluyoruz!");
                do {
                    System.out.println("1-Deposit money\n" +
                            "2-Withdraw money\n" +
                            "3-Balance Inquiry\n" +
                            "4-Sign out");
                    System.out.print("Please select the action you want to do : ");
                    select = input.nextInt();
                    switch(select) {
             
                    case 1:
                    	System.out.print("Amount of money : ");
                        int price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                    	System.out.print("Amount of money  : ");
                        int price1 = input.nextInt();
                        if (price1 > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= price1;
                        }
                        break;
                    case 3:
                    	System.out.println("Balance : " + balance);
                    	break;
                    default:
                    	System.exit(0);
                    	break;
                    }
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your Remaining Rights : " + right);
                }
            }
         input.close();
        }
    }
}