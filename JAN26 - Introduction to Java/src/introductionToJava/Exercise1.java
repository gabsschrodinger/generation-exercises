package introductionToJava;

import java.util.Scanner;

/**
 * Write a program that will take a person's age in years, months and days as input and will print the age in days.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise1 {
	public static void main(String[] args) {
		int years, months, days, total;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert your age in years, months and days.\nYears: ");
		years = scan.nextInt();
		System.out.println("Months: ");
		months = scan.nextInt();
		System.out.println("Days: ");
		days = scan.nextInt();
		total = years * 365 + months * 30 + days;
		
		System.out.println("You are "+ total+ " days old.");
	}
}
