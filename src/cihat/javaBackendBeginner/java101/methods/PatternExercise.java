package cihat.javaBackendBeginner.java101.methods;

import java.util.Scanner;

/** @author Cihat Gelir
 *  NOTE: Special thanks to tunalime.*/
public class PatternExercise {
	 public static int recursivePattern(int var,int temp, boolean x){
        System.out.print(temp + " ");
        if (temp <= 0)
            x = false;
        if (!x && temp == var)
            return 1;
        
        if (x){	return recursivePattern(var,temp-5,x);} 
        else	return recursivePattern(var,temp+5,x);
    }
	 
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number: ");
		int userInput = sc.nextInt();
		recursivePattern(userInput, userInput, true);
		sc.close();
	}
}