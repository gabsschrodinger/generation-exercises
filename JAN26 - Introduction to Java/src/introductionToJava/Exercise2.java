package introductionToJava;

import java.util.Scanner;

/**
 * Write a program that will take a person's age in days as input and will print the age in years, months and days.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise2 {
	public static void main(String[] args) {
		int years, months, days, total;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many days old are you? ");
		total = scan.nextInt();
		
		years = total / 365;
		months = total % 365 / 30;
		days = total - years * 365 - months * 30;
		
		System.out.println("Age: "+ years+ " years, "+ months+ " months and "+ days+ " days.");
	}
}
