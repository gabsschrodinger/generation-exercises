package loopingStatements;

import java.util.Scanner;

/**
 * Write a program that will take any number (except 0) as input and will print the sum of these numbers. To break the looping, insert 0.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise5 {
	public static void main(String[] args) {
		double number, sum=0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Insert a number: ");
			number = scan.nextDouble();
			sum += number;
		} while(number != 0);
		
		System.out.println("\nSum of entered numbers: "+ sum);
	}
}
