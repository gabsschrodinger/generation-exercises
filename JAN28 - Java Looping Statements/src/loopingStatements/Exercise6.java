package loopingStatements;

import java.util.Scanner;

/**
 * Write a program that will take integers (except 0) as input and will print the arithmetic mean of multiples of 3. To break the looping, insert 0.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise6 {
	public static void main(String[] args) {
		int number, i=0;
		double sum=0;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Insert an integer: ");
			number = scan.nextInt();
			if(number != 0) {
				if(number % 3 == 0) {
					sum += number;
					i++;
				}
			} else {
				System.out.println("Closing the program...");
			}
		} while(number != 0);
		
		System.out.println("Arithmetic mean of multiples of 3: "+ (sum/i));
	}
}
