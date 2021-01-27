package javaConditions;

import java.util.Scanner;

/**
 * Write a program that will take three integers as input and will print the largest number.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise1 {
	public static void main(String[] args) {
		int number1, number2, number3, biggest;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the first number: ");
		number1 = scan.nextInt();
		biggest = number1;
		
		System.out.println("\nInsert the second number: ");
		number2 = scan.nextInt();
		if(number2 > biggest) {
			biggest = number2;
		}
		
		System.out.println("\nInsert the third number: ");
		number3 = scan.nextInt();
		if(number3 > biggest) {
			biggest = number3;
		}
		
		System.out.println("\nThe biggest number is "+ biggest);
	}
}
