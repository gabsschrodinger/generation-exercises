package introductionToJava;

import java.util.Scanner;

/**
 * Write a program that will take the period of an event in seconds as input and will print the period in hours, minutes and seconds.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise3 {
	public static void main(String[] args) {
		int total, hours, minutes, seconds;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many seconds did the event last? ");
		total = scan.nextInt();
		
		hours = total / 3600;
		minutes = total % 3600 / 60;
		seconds = total - hours * 3600 - minutes * 60;
		
		System.out.println("The event lasted "+ hours+ " hours, "+ minutes+ " minutes and "+ seconds+ " seconds.");
	}
}
