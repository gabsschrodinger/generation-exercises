package javaConditions;

import java.util.Scanner;

/**
 * Write a program that will any number as input and will print the number's parity. If it is an even number, the program will print the square root of the number, and if it is an odd number, the program will print the square of the number.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise4 {
	public static void main(String[] args) {
		double number;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert any number: ");
		number = scan.nextDouble();
		
		if(number % 2 == 0) {
			System.out.println("The number "+ number+ " is an even number. The square root of "+ number+ " is "+ Math.sqrt(number));
		} else {
			System.out.println("The number "+ number+ " is an odd number. The square of "+ number+ " is "+ number*number);
		}
	}
}
