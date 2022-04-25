package cihat.javaBackendBeginner.java101.conditionalExpressions;

import java.util.Scanner;

public class ZodiacSignExercise {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Month : ");
		int month = scan.nextInt();
		
		System.out.print("Day : ");
		int day = scan.nextInt();
		
		
		boolean aries =  	  (month == 3 && day >= 21) || (month == 4 && day <= 20);
		boolean taurus = 	  (month == 4 && day >= 21) || (month == 5 && day <= 21);
		boolean gemini = 	  (month == 5 && day >= 22) || (month == 6 && day <= 22);
		boolean cancer = 	  (month == 6 && day >= 23) || (month == 7 && day <= 22);
		boolean leo =    	  (month == 7 && day >= 23) || (month == 8 && day <= 22);
		boolean virgo =  	  (month == 8 && day >= 23) || (month == 9 && day <= 22);
		boolean libra =  	  (month == 9 && day >= 23) || (month == 10 && day <=22);
		boolean scorpio =  	  (month == 10 && day >=23) || (month == 11 && day <=21);
		boolean sagittarius = (month == 11 && day >=22) || (month == 12 && day <=21);
		boolean capricorn =   (month == 12 && day >=22) || (month == 1 && day <=21);
		boolean aquarius =    (month == 1 && day >= 22) || (month ==  2 && day <=19);
		boolean pisces =      (month == 2 && day >= 20) || (month ==  3 && day <=20);
		
		System.out.println(aries       ? "aries."      :
						   taurus      ? "taurus"      :
						   gemini      ? "gemini."     :
						   cancer      ? "cancer"      : 
						   leo         ? "leo."        :
						   virgo       ? "virgo"       : 
						   libra       ? "libra."      :
						   scorpio     ? "scorpio"     :
						   sagittarius ? "sagittarius.":
						   capricorn   ? "capricorn"   :
	    				   aquarius    ? "aquarius"    :
						   pisces      ? "pisces"      : "Invalid input");
	}
}
