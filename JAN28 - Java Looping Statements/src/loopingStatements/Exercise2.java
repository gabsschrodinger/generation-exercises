package loopingStatements;

import java.util.Scanner;

/**
 * Write a program that will take 10 numbers as input and will print the amount of even and odd numbers entered.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise2 {
	public static void main(String[] args) {
		int i, number, even=0, odd=0;
		Scanner scan = new Scanner(System.in);
		
		for(i = 1; i <= 10; i++) {
			System.out.println("Insert an integer: ");
			number = scan.nextInt();
			if(number % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		
		System.out.println("\nAmount of even numbers: "+ even+ "\nAmount of odd numbers: "+ odd);
	}
}
