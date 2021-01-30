package introductionToJava;

import java.util.Scanner;

/**
 * Write a program that will take the production cost of a car as input and will print the final price to consumer of the car, considering taxes (45% of the production cost) and selling expenses (28% of the production cost).
 * @author gabsschrodinger (https://github.com/gabsschrodinger)
 * @status finished
 */

public class Exercise8 {
	public static void main(String[] args) {
		double price, cost, sellingExpenses, taxes;
		Scanner scan = new Scanner(System.in);
		
		taxes = 0.45;
		sellingExpenses = 0.28;
		
		System.out.println("Insert the car cost: ");
		cost = scan.nextDouble();
		price = cost * (1 + taxes + sellingExpenses);
		
		System.out.println("Car price: "+ price);
	}
}
