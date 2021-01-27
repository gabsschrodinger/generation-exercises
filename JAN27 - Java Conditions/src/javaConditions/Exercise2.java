package javaConditions;

import java.util.Scanner;

/**
 * Write a program that will take three numbers as input and will print the numbers in ascending order.
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise2 {
	public static void main(String[] args) {
		double number1, number2, number3;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the first number: ");
		number1 = scan.nextDouble();
		
		System.out.println("Insert the second number: ");
		number2 = scan.nextDouble();
		
		System.out.println("Insert the third number: ");
		number3 = scan.nextDouble();
		
		if(number1 <= number2 && number1 <= number3) {
			if(number2 <= number3) {
				System.out.println("\n1st: "+ number1+ "\n2nd: "+ number2+ "\n3rd: "+ number3);
			} else {
				System.out.println("\n1st: "+ number1+ "\n2nd: "+ number3+ "\n3rd: "+ number2);
			}
		} else if(number2 <= number1 && number2 <= number3) {
			if(number1 <= number3) {
				System.out.println("\n1st: "+ number2+ "\n2nd: "+ number1+ "\n3rd: "+ number3);
			} else {
				System.out.println("\n1st: "+ number2+ "\n2nd: "+ number3+ "\n3rd: "+ number1);
			}
		} else {
			if(number1 <= number2) {
				System.out.println("\n1st: "+ number3+ "\n2nd: "+ number1+ "\n3rd: "+ number2);
			} else {
				System.out.println("\n1st: "+ number3+ "\n2nd: "+ number2+ "\n3rd: "+ number1);
			}
		}
	}
}
