package cihat.javaBackendBeginner.java101;
import java.util.Scanner;

/**
  Write a program that takes the exam scores of  Mathematics, Physics, Chemistry, Turkish, History, Music courses
from the user and calculates the averages and prints them on the screen.

  In the same program, by using conditional expressions, if the average of the user is greater than 60,
the screen should write "Passed the Course", if it is less, "Failed in the Course".

  Note: If and Else will not be used...
  Note: Expect perfect user inputs..

  @author  Cihat Gelir cihatgelir35@gmail.com
 */
public class NoteCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat, physics, chem, tur, hist, music;

        System.out.print("Mathematics : ");
        mat = scanner.nextInt();

        System.out.print("Physics : ");
        physics = scanner.nextInt();

        System.out.print("Chemistry : ");
        chem = scanner.nextInt();

        System.out.print("Turkish : ");
        tur = scanner.nextInt();

        System.out.print("History : ");
        hist = scanner.nextInt();

        System.out.print("Music : ");
        music = scanner.nextInt();

        float avg = (mat + physics + chem + tur + hist + music)/6;
        System.out.println("Average is :" + avg);

        System.out.println((avg > 60) ? "Passed the Course" : "Failed the Course");
    }
}
