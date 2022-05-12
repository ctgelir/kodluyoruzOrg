package cihat.javaBackendBeginner.java101.methods;

import java.util.Scanner;

/**@author Cihat Gelir*/
public class AdvancedCalculatorExercise {
	 static void plus() {
	        Scanner scan = new Scanner(System.in);
	        int number, result = 0, i = 1;
	        while (true) {
	            System.out.print(i++ + ". number :");
	            number = scan.nextInt();
	            if (number == 0) {
	                break;
	            }
	            result += number;
	        }
	        System.out.println("Result : " + result);
	    }

	 static void minus() {
	     Scanner scan = new Scanner(System.in);
	     System.out.print("How many numbers u will enter :");
	     int counter = scan.nextInt();
	     int number, result = 0;
	
	     for (int i = 1; i <= counter; i++) {
	         System.out.print(i + ". number :");
	         number = scan.nextInt();
	         if (i == 1) {
	             result += number;
	             continue;
	         }
	         result -= number;
	     }
	
	     System.out.println("Result : " + result);
	 }

	 static void times() {
	     Scanner scan = new Scanner(System.in);
	     int number, result = 1, i = 1;
	
	     while (true) {
	         System.out.print(i++ + ". number :");
	         number = scan.nextInt();
	
	         if (number == 1)
	             break;
	
	         if (number == 0) {
	             result = 0;
	             break;
	         }
	         result *= number;
	     }
	
	     System.out.println("Result : " + result);
	 }

	 static void divided() {
	     Scanner scan = new Scanner(System.in);
	     System.out.print("How many numbers u will enter :");
	     int counter = scan.nextInt();
	     double number, result = 0.0;
	
	     for (int i = 1; i <= counter; i++) {
	         System.out.print(i + ". sayı :");
	         number = scan.nextDouble();
	         if (i != 1 && number == 0) {
	             System.out.println("Cannot divide by zero!");
	             continue;
	         }
	         if (i == 1) {
	             result = number;
	             continue;
	         }
	         result /= number;
	     }
	
	     System.out.println("Result : " + result);
	 }

	 static void power() {
	     Scanner scan = new Scanner(System.in);
	     System.out.print("Base value :");
	     int base = scan.nextInt();
	     System.out.print("Power value :");
	     int exponent = scan.nextInt();
	     int result = 1;
	
	     for (int i = 1; i <= exponent; i++) {
	         result *= base;
	     }
	
	     System.out.println("Result : " + result);
	 }

	 static void factorial() {
	     Scanner scan = new Scanner(System.in);
	     System.out.print("Number :");
	     int n = scan.nextInt();
	     int result = 1;
	
	     for (int i = 1; i <= n; i++) {
	         result *= i;
	     }
	
	     System.out.println("Result : " + result);
	 }

	 static void modulo() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("How many operation you will perform:");
		 int t = sc.nextInt();
		 
		 for (int i = 0; i < t; i++) {
			 System.out.print("Number: ");
			 int userNum = sc.nextInt();
			 
			 System.out.print("Modulo: ");
			 int modulo = sc.nextInt();
			 
			 System.out.println("Result: " + userNum % modulo);
		 }
	 }
	 
	 static void areaPerimeter() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Side1 :");
		 int s1 = sc.nextInt();
		 
		 System.out.print("Side2 :");
		 int s2 = sc.nextInt();
		 
		 System.out.println("Area: " + s1*s2 + " -- " + "Perimeter: " + 2*(s1+s2));
	 }
	 
	 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Power Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Modulo Calculation\n"
                + "8- Area and perimeter Calculation\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please select an operation :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                	modulo();
                	break;
                case 8:
                	areaPerimeter();
                	break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid option. Please select correctly.");
	            }
	        } while (select != 0);
	    }
}
